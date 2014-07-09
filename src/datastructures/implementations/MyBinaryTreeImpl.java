package datastructures.implementations;


public class MyBinaryTreeImpl<T>
{
	T data;
	Node<T> root;

	private class Node<Type>
	{
		Type data;
		Node<Type> left, right;
		int nodeSize;

		Node(Type data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
			nodeSize = 1;
		}

		Node(Type data, int nodeSize)
		{
			this.data = data;
			this.nodeSize = nodeSize;
		}
	}

	public void insert(T data)
	{
		root = insert(root, data);
	}

	private Node<T> insert(Node<T> root, T data)
	{
		Node<T> n = new Node<T>(data, 1);
		if (root == null)
		{
			root = n;
			return root;
		}
		if (root.left == null)
		{
			root.left = n;
		}
		else if (root.right == null)
		{
			root.right = n;
		}
		else
		{
			if (root.left.nodeSize <= root.right.nodeSize)
			{
				root.left = insert(root.left, data);
			}
			else
			{
				root.right = insert(root.right, data);
			}
		}
		root.nodeSize = size(root.left) + size(root.right) + 1;
		return root;
	}

	public int size()
	{
		return size(root);
	}

	private int size(Node<T> root)
	{
		if (root == null)
			return 0;
		return root.nodeSize;
	}
	
	public int maxDepth()
	{
		return maxDepth(root);
	}

	public int maxDepth(Node<T> root)
	{
		if (root == null)
			return 0;
		int maxLeft = maxDepth(root.left);
		int maxRight = maxDepth(root.right);
		return (Math.max(maxLeft, maxRight) + 1);
	}

	public void printBFS()
	{
		printBFS(root);
	}

	private void printBFS(Node<T> root)
	{
		MyQueueImpl<Node<T>> curLevel = new MyQueueImpl<Node<T>>();
		MyQueueImpl<Node<T>> nextLevel = new MyQueueImpl<Node<T>>();
		if (root == null)
			return;
		curLevel.enqueue(root);
		while (curLevel.size() > 0)
		{
			Node<T> current = curLevel.dequeue();
			System.out.print(current.data + " ");
			if (current.left != null)
				nextLevel.enqueue(current.left);
			if (current.right != null)
				nextLevel.enqueue(current.right);
			if (curLevel.size() == 0)
			{
				System.out.println();
				curLevel = nextLevel;
				nextLevel = new MyQueueImpl<Node<T>>();
			}
		}
	}

	public boolean DFS(T data)
	{
		return DFS(root, data);
	}

	private boolean DFS(Node<T> node, T data)
	{
		if (node == null)
			return false;
		if (node.data == data)
			return true;
		else
		{
			return DFS(node.left, data) || DFS(node.right, data);
		}
	}

	public boolean BFS(T data)
	{
		return BFS(root, data);
	}

	private boolean BFS(Node<T> node, T data)
	{
		if (node == null)
			return false;
		MyQueueImpl<Node<T>> nodeQueue = new MyQueueImpl<Node<T>>();
		nodeQueue.enqueue(node);
		while (nodeQueue.size() > 0)
		{
			Node<T> n = nodeQueue.dequeue();
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

	public static void main(String[] args)
	{
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
		for (int i = 16; i < 19; i++)
		{
			System.out.println("(BFS) Finding if value " + i + " is in tree: " + tree.BFS(i));
			System.out.println("(DFS) Finding if value " + i + " is in tree: " + tree.DFS(i));
		}
	}
}

// class MyQueueImpl<T>
// {
// T data;
// Node<T> head, tail;
// int length = 0;
//
// private class Node<Type>
// {
// Type data;
// Node<Type> next;
//
// Node(Type data)
// {
// this.data = data;
// }
// }
//
// public MyQueueImpl()
// {
// tail = null;
// head = null;
// length = 0;
// }
//
// public void enqueue(T data)
// {
// Node<T> n = new Node<T>(data);
// if (tail == null)
// {
// head = tail = n;
// }
// else
// {
// tail.next = n;
// tail = tail.next;
// }
// length++;
// }
//
// public T dequeue()
// {
// if (head == null)
// return null;
// T temp = head.data;
// head = head.next;
// length--;
// return temp;
// }
//
// public int size()
// {
// return length;
// }
// }
