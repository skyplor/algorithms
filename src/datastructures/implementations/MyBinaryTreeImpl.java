package datastructures.implementations;

import datastructures.util.TreeNode;

@SuppressWarnings("unused")
public class MyBinaryTreeImpl<T extends Comparable<T>> {
    T data;
    TreeNode<T> root;

//    private class Node<Type> {
//	Type data;
//	Node<Type> left, right;
//	int nodeSize;
//
//	Node(Type data) {
//	    this.data = data;
//	    this.left = null;
//	    this.right = null;
//	    nodeSize = 1;
//	}
//
//	Node(Type data, int nodeSize) {
//	    this.data = data;
//	    this.nodeSize = nodeSize;
//	}
//    }

    public void insert(T data) {
	root = insert(root, data);
    }

    private TreeNode<T> insert(TreeNode<T> root, T data) {
	TreeNode<T> n = new TreeNode<T>(data);
	if (root == null) {
	    root = n;
	    return root;
	}
	if (root.left == null) {
	    root.left = n;
	} else if (root.right == null) {
	    root.right = n;
	} else {
	    if (root.left.nodeSize <= root.right.nodeSize) {
		root.left = insert(root.left, data);
	    } else {
		root.right = insert(root.right, data);
	    }
	}
	root.nodeSize = size(root.left) + size(root.right) + 1;
	return root;
    }

    public int size() {
	return size(root);
    }

    private int size(TreeNode<T> root) {
	if (root == null)
	    return 0;
	return root.nodeSize;
    }

    public int maxDepth() {
	return maxDepth(root);
    }

    public int maxDepth(TreeNode<T> root) {
	if (root == null)
	    return 0;
	int maxLeft = maxDepth(root.left);
	int maxRight = maxDepth(root.right);
	return (Math.max(maxLeft, maxRight) + 1);
    }

    public void printBFS() {
	printBFS(root);
    }

    private void printBFS(TreeNode<T> root) {
	MyQueueImpl<TreeNode<T>> curLevel = new MyQueueImpl<TreeNode<T>>();
	MyQueueImpl<TreeNode<T>> nextLevel = new MyQueueImpl<TreeNode<T>>();
	if (root == null)
	    return;
	curLevel.enqueue(root);
	while (curLevel.size() > 0) {
	    TreeNode<T> current = curLevel.dequeue();
	    System.out.print(current.data + " ");
	    if (current.left != null)
		nextLevel.enqueue(current.left);
	    if (current.right != null)
		nextLevel.enqueue(current.right);
	    if (curLevel.size() == 0) {
		System.out.println();
		curLevel = nextLevel;
		nextLevel = new MyQueueImpl<TreeNode<T>>();
	    }
	}
    }

    private void printDFS(TreeNode<T> root) {
	if (root == null)
	    return;
	System.out.println(root.data + " ");
	if (root.left != null)
	    printDFS(root.left);
	if (root.right != null)
	    printDFS(root.right);
    }

    public boolean DFS(T data) {
	return DFS(root, data);
    }

    private boolean DFS(TreeNode<T> node, T data) {
	if (node == null)
	    return false;
	if (node.data == data)
	    return true;
	else {
	    return DFS(node.left, data) || DFS(node.right, data);
	}
    }

    public boolean BFS(T data) {
	return BFS(root, data);
    }

    private boolean BFS(TreeNode<T> node, T data) {
	if (node == null)
	    return false;
	MyQueueImpl<TreeNode<T>> nodeQueue = new MyQueueImpl<TreeNode<T>>();
	nodeQueue.enqueue(node);
	while (nodeQueue.size() > 0) {
	    TreeNode<T> n = nodeQueue.dequeue();
	    if (n.data == data)
		return true;

	    if (n.left != null)
		nodeQueue.enqueue(n.left);
	    if (n.right != null)
		nodeQueue.enqueue(n.right);
	    System.out.println("Queue size: " + nodeQueue.size());
	}
	System.out.println("Couldn't find data in tree");
	return false;
    }

    /**
     * @return the root
     */
    public TreeNode<T> getRoot() {
        return root;
    }

    public static void main(String[] args) {
	MyBinaryTreeImpl<Integer> tree = new MyBinaryTreeImpl<Integer>();
	tree.insert(10);
	tree.insert(11);
	tree.insert(12);
	tree.insert(13);
	tree.insert(14);
	tree.insert(15);
	tree.insert(16);
	tree.insert(17);
	tree.printBFS();
	for (int i = 16; i < 19; i++) {
	    System.out.println("(BFS) Finding if value " + i + " is in tree: " + tree.BFS(i));
	    System.out.println("(DFS) Finding if value " + i + " is in tree: " + tree.DFS(i));
	}
    }
}