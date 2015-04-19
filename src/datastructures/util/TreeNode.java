package datastructures.util;

/* One node of a binary tree. The data element stored is a single 
 * character.
 */
public class TreeNode<T extends Comparable<T>>
{
	public T data;
	public TreeNode<T> left;
	public TreeNode<T> right;
	public TreeNode<T> parent;
	public int nodeSize = 0;

	public TreeNode(T d)
	{
		data = d;
		nodeSize = 1;
	}

	public void setLeftChild(TreeNode<T> left)
	{
		this.left = left;
		if (left != null)
		{
			left.parent = this;
		}
	}

	public void setRightChild(TreeNode<T> right)
	{
		this.right = right;
		if (right != null)
		{
			right.parent = this;
		}
	}

	public void insertInOrder(T d)
	{
		if (d.compareTo(data) == -1 || d.compareTo(data) == 0)
		{
			if (left == null)
			{
				setLeftChild(new TreeNode<T>(d));
			}
			else
			{
				left.insertInOrder(d);
			}
		}
		else
		{
			if (right == null)
			{
				setRightChild(new TreeNode<T>(d));
			}
			else
			{
				right.insertInOrder(d);
			}
		}
		nodeSize++;
	}

	public boolean isBST()
	{
		if (left != null)
		{
			if (data.compareTo(left.data) == -1 || !left.isBST())
			{
				return false;
			}
		}

		if (right != null)
		{
			if (data.compareTo(right.data) == 0 || data.compareTo(right.data) == 1 || !right.isBST())
			{
				return false;
			}
		}

		return true;
	}

	public int height()
	{
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public TreeNode<T> find(T d)
	{
		if (d.compareTo(data) == 0)
		{
			return this;
		}
		else if (d.compareTo(data) == -1)
		{
			return left != null ? left.find(d) : null;
		}
		else if (d.compareTo(data) == 1)
		{
			return right != null ? right.find(d) : null;
		}
		return null;
	}

	private TreeNode<T> createMinimalBST(T arr[], int start, int end)
	{
		if (end < start)
		{
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode<T> n = new TreeNode<T>(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}

	public TreeNode<T> createMinimalBST(T array[])
	{
		return createMinimalBST(array, 0, array.length - 1);
	}

	public void print()
	{
		BTreePrinter.printNode(this);
	}
}
