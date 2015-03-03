package datastructures.recursion_dynamicprogramming;

public class ReverseLinkedList {

    public class Node {
	public char value;
	public Node next;
    }

    public Node reverseList(Node head) {
	Node first = new Node();
	doReverse(first, head);
	return first.next; // return the new head node
    }

    public Node doReverse(Node first, Node head) {
	if (head == null || head.next == null) {
	    first.next = head; // save the new head node
	    return head;
	}

	Node tail = head;
	Node preTail = doReverse(first, head.next);
	preTail.next = tail;
	tail.next = null;

	return tail;

    }

    public void reverseListIteratively(Node head) {
	if (head == null || head.next == null)
	    return; // empty or just one node in list

	Node Second = head.next;

	// store third node before we change
	Node Third = Second.next;

	// Second's next pointer
	Second.next = head; // second now points to head
	head.next = null; // change head pointer to NULL

	// only two nodes, which we already reversed
	if (Third == null)
	    return;

	Node CurrentNode = Third;

	Node PreviousNode = Second;

	while (CurrentNode != null) {
	    Node NextNode = CurrentNode.next;

	    CurrentNode.next = PreviousNode;

	    /*
	     * repeat the process, but have to reset
	     * the PreviousNode and CurrentNode
	     */

	    PreviousNode = CurrentNode;
	    CurrentNode = NextNode;
	}

	head = PreviousNode; // reset the head node
    }
}
