package datastructures.implementations;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyStackImpl<T> implements Iterable<T> {
    T data;
    Node<T> top;
    int length = 0;

    public static void main(String[] args) {
	MyStackImpl<Integer> stack = new MyStackImpl<Integer>(10);
	stack.push(11);
	stack.push(12);
	System.out.println("Pop: " + stack.pop());
	stack.push(13);
	System.out.println("Peek: " + stack.peek());
	stack.push(14);
	int size = stack.size();
	for (int i = 0; i < size; i++) {
	    System.out.println(stack.pop());
	}
    }

    private class Node<Type> {
	Type data;
	Node<Type> next;
    }

    public MyStackImpl(T data) {
	top = new Node<T>();
	top.data = data;
	length++;
    }

    public MyStackImpl() {
    }

    public void push(T data) {
	Node<T> n = new Node<T>();
	n.data = data;
	if (top == null) {
	    top = n;
	    length++;
	} else {
	    n.next = top;
	    top = n;
	    length++;
	}
    }

    public T pop() {
	if (top == null)
	    return null;
	T temp = top.data;
	top = top.next;
	length--;
	return temp;
    }

    public T peek() {
	if (top == null)
	    return null;
	return top.data;
    }

    public int size() {
	return length;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    public Iterator<T> iterator() {
	MyIterator iterate = new MyIterator();
	return iterate;
    }

    private class MyIterator implements Iterator<T> {
	Node<T> current = top;

	@Override
	public boolean hasNext() {
	    return current != null;
	}

	@Override
	public T next() {
	    if (!hasNext())
		throw new NoSuchElementException();
	    T data = current.data;
	    current = current.next;
	    return data;
	}

	@Override
	public void remove() {
	    throw new UnsupportedOperationException();
	}
    }
}
