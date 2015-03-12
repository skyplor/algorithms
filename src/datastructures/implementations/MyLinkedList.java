package datastructures.implementations;

public class MyLinkedList<Element> {
	private class Node<E> {
		E value;
		Node<E> next;
	}
	
	Node<Element> head;
	int count;
	public MyLinkedList() {
		count = 0;
	}
	public void add(Element e) {
		if (head == null) {
			head = new Node<Element>();
			head.value = e;
		}
		else {
			Node<Element> n = new Node<Element>();
			n.value = e;
			n.next = head;
			head = n;
		}
		count++;
	}
	
	public Element remove(int i) {
		Node<Element> cur = head;
		Node<Element> result = null;
		if (i < count) {
			for(int j = 0; j < i; j++) {
				cur = cur.next;
			}
			if (cur != null && cur.next != null) {
				result = cur.next;
				cur.next = cur.next.next;
				count--;
			}
			if(result != null) return result.value;
		}
		return null;
	}
	
	public Element get(int i) {
		Node<Element> cur = head;
		Node<Element> result = null;
		if (i < count) {
			for(int j = 0; j < i; j++) {
				cur = cur.next;
			}
			if (cur != null && cur.next != null) {
				result = cur.next;
			}
			if(result != null) return result.value;
		}
		return null;
	}
	
	public int length() {
		return count;
	}
}