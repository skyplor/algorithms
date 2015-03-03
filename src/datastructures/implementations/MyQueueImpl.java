package datastructures.implementations;

public class MyQueueImpl<T> {
    int length = 0;
    T data;
    Node<T> head, tail;

    public static void main(String[] args) {
	MyQueueImpl<Integer> queue = new MyQueueImpl<Integer>(10);
	queue.enqueue(11);
	queue.enqueue(12);
	System.out.println("Dequeue: " + queue.dequeue());
	queue.enqueue(13);
	int size = queue.size();
	for (int i = 0; i < size; i++) {
	    System.out.println("Dequeuing: " + queue.dequeue());
	}
    }

    private class Node<Type> {
	Type data;
	Node<Type> next;

	Node() {
	}

	Node(Type data) {
	    this.data = data;
	}

	Node(Type data, Node<Type> next) {
	    this.data = data;
	    this.next = next;
	}
    }

    public MyQueueImpl(T data) {
	tail = new Node<T>(data);
	head = tail;
	length++;
    }

    public MyQueueImpl() {
	tail = null;
	head = tail;
    }

    public void enqueue(T data) {
	Node<T> n = new Node<T>(data);
	if (head == null) {
	    head = n;
	    tail = n;
	    length++;
	} else {
	    tail.next = n;
	    tail = tail.next;
	    length++;
	}
    }

    public T dequeue() {
	if (head == null) {
	    return null;
	}
	T temp = head.data;
	head = head.next;
	length--;
	return temp;
    }

    public int size() {
	return length;
    }

    public boolean isEmpty() {
	return size() == 0;
    }
    
    public T peek() {
	return head.data;
    }
}
