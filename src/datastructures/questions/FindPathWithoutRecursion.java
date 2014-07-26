package datastructures.questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import datastructures.implementations.MyStackImpl;
import datastructures.util.AssortedMethods;
import datastructures.util.BTreePrinter;
import datastructures.util.TreeNode;

/**
 * Print the paths of the root to leaf of a binary tree WITHOUT using recursion.
 * 
 * @author Sky
 * 
 */
public class FindPathWithoutRecursion {

    /**
     * @param args
     */
    public static void main(String[] args) {
	TreeNode tree = AssortedMethods.randomBST(20, 0, 80);
	BTreePrinter.printNode(tree);
	findPathToRoot(tree);
	printAllPathToLeafNonRecursive(tree);

    }

    public static void findPathToRoot(TreeNode root) {
	if (root == null)
	    return;
	MyStackImpl<TreeNode> s = new MyStackImpl<TreeNode>();
	HashMap<TreeNode, TreeNode> edgeTo = new HashMap<TreeNode, TreeNode>();
	s.push(root);
	while (!s.isEmpty()) {
	    TreeNode cur = s.pop();
	    if (cur.left != null) {
		edgeTo.put(cur.left, cur);
		s.push(cur.left);
	    }
	    if (cur.right != null) {
		edgeTo.put(cur.right, cur);
		s.push(cur.right);
	    }
	    if (cur.left == null && cur.right == null)
		printPathToRoot(root, cur, edgeTo);
	}
    }

    private static void printPathToRoot(TreeNode source, TreeNode dest, HashMap<TreeNode, TreeNode> edgeTo) {
	MyStackImpl<TreeNode> stack = new MyStackImpl<TreeNode>();
	while (dest != source) {
	    // if printing from leaf to root, we straight away print now.
	    // System.out.print(dest.data + " ");
	    stack.push(dest);
	    dest = edgeTo.get(dest);
	}
	// if printing from leaf to root, we straight away print now.
	// System.out.println(dest.data);
	stack.push(dest);
	while (!stack.isEmpty()) {
	    TreeNode cur = stack.pop();
	    System.out.print(cur.data + " ");
	}
	System.out.println();
    }

    public static void printAllPathToLeafNonRecursive(TreeNode root) {
	if (root == null) {
	    return;
	}

	Queue<Object> q = new LinkedList<Object>();
	q.add(root);
	q.add(root.data + "");

	while (!q.isEmpty()) {

	    TreeNode head = (TreeNode) q.remove();
	    String headPath = (String) q.remove();

	    if (head.left == null && head.right == null) {
		System.out.println(headPath);
		continue;
	    }

	    if (head.left != null) {
		String leftStr = headPath + "->" + head.left.data;
		q.add(head.left);
		q.add(leftStr);
	    }

	    if (head.right != null) {
		String rightStr = headPath + "->" + head.right.data;
		q.add(head.right);
		q.add(rightStr);
	    }
	}
    }

}
