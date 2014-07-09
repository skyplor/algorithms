package datastructures.implementations;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedListImpl<T> implements Iterable<T>
{
	T data;
	Node<T> head;
	int length;

	public static void main(String[] args)
	{
		MyLinkedListImpl<Integer> link = new MyLinkedListImpl<Integer>(10);
		link.add(11);
		link.add(12);
		link.add(13);
		link.remove(12);
		link.add(14);
		for (int i = 0; i < link.size(); i++)
			System.out.println("Data at position " + i + " of linked list: " + link.get(i));
		for (int nodedata : link)
			System.out.println("Data in foreach is: " + nodedata);
	}

	private class Node<Type>
	{
		Type data;
		Node<Type> next;

		Node()
		{
		};

		Node(Type data)
		{
			this.data = data;
		}

		Node(Type data, Node<Type> next)
		{
			this.data = data;
			this.next = next;
		}
	}

	public MyLinkedListImpl()
	{
	}

	public MyLinkedListImpl(T data)
	{
		this.data = data;
		head = new Node<T>(data);
	}

	public void add(T data)
	{
		Node<T> n = new Node<T>(data);
		Node<T> current = head;
		if (head == null)
		{
			head = n;
			length++;
		}
		else
		{
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = n;
			length++;
		}
	}

	public T get(int position)
	{
		Node<T> current = head;
		int pointer = 0;
		if (position > pointer && position < length)
		{
			for (pointer = 0; pointer < position; pointer++)
			{
				current = current.next;
			}
		}
		else if (position < pointer)
		{
			return null;
		}
		return current.data;
	}

	public boolean remove(T data)
	{
		Node<T> current = head;
		if (head == null)
			return false;
		if (head.data == data)
		{
			head = head.next;
			length--;
			return true;
		}
		while (current.next != null)
		{
			if (current.next.data == data)
			{
				current.next = current.next.next;
				length--;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public int size()
	{
		return length;
	}

	public MyIterator<T> iterator()
	{
		MyIterator<T> iterate = new MyIterator<T>(this);
		return iterate;
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		Node<T> current = head;
		while (current != null)
		{
			sb.append("[" + current.data + "]");
			current = current.next;
		}
		return sb.toString();
	}

	private class MyIterator<Type> implements Iterator<Type>
	{
		MyLinkedListImpl<Type> list;
		int currentPosition;

		MyIterator(MyLinkedListImpl<Type> list)
		{
			this.list = list;
			currentPosition = 0;
		}

		@Override
		public boolean hasNext()
		{
			return currentPosition < list.size();
		}

		@Override
		public Type next()
		{
			if (!hasNext())
				throw new NoSuchElementException();
			return list.get(currentPosition++);
		}

		@Override
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	}
}
