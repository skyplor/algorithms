package datastructures.questions;

import java.util.ArrayList;
import java.util.List;

import datastructures.implementations.MyQueueImpl;
import datastructures.util.TreeNode;

public class PrintLeftViewBinaryTree {

    public List<Integer> leftViewTree(TreeNode<Integer> root) {
	if (root != null) {
	    MyQueueImpl<TreeNode<Integer>> curLevel = new MyQueueImpl<TreeNode<Integer>>();
	    MyQueueImpl<TreeNode<Integer>> nextLevel = new MyQueueImpl<TreeNode<Integer>>();
	    List<Integer> results = new ArrayList<Integer>();

	    curLevel.enqueue(root);
	    boolean isLeft = true;
	    while (!curLevel.isEmpty()) {
		TreeNode<Integer> n = curLevel.dequeue();
		if (isLeft && n.data != null) {
		    results.add(n.data);
		    isLeft = false;
		}
		if (n.left != null)
		    nextLevel.enqueue(n.left);
		if (n.right != null)
		    nextLevel.enqueue(n.right);
		if (curLevel.isEmpty()) {
		    curLevel = nextLevel;
		    nextLevel = new MyQueueImpl<TreeNode<Integer>>();
		    isLeft = true;
		}
	    }
	    return results;
	}
	return null;
    }
}
