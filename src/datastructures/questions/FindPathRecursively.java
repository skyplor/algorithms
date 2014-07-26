package datastructures.questions;

import java.util.ArrayList;

import datastructures.util.AssortedMethods;
import datastructures.util.BTreePrinter;
import datastructures.util.TreeNode;

/**
 * Print the paths of the root to leaf of a binary tree using recursion
 * 
 * @author Sky
 * 
 */
public class FindPathRecursively {

    /**
     * @param args
     */
    public static void main(String[] args) {
	TreeNode node = AssortedMethods.randomBST(20, 0, 80);
	BTreePrinter.printNode(node);
	findPathToRoot(node);
    }

    public static void findPathToRoot(TreeNode node) {
	printPathToRoot(node, new ArrayList<Integer>());

    }

    private static void printPathToRoot(TreeNode node, ArrayList<Integer> path) {
	if (node == null)
	    return;
	path.add(node.data);
	if (node.left != null) {
	    printPathToRoot(node.left, new ArrayList<Integer>(path));
	}
	if (node.right != null) {
	    printPathToRoot(node.right, new ArrayList<Integer>(path));
	}
	if (node.left == null && node.right == null) {
	    System.out.println(path);
	}
    }

}
