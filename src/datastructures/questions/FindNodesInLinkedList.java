package datastructures.questions;

import java.util.LinkedList;

/**
 * 1) Find the second last node of a linked list.
 * 2) Find Nth node from the last in a given linked list. Find it's complexity.
 * 
 * @author Sky
 *
 */
public class FindNodesInLinkedList {

    // First, I can think of using brute force method of storing all the elements in an array and retrieving it in O(1) time.
    // Though this also means O(N) memory space.
    // Next I can think of making use of the size of the linkedlist and having a counter to count to reach the particular node.

    // Assuming the node is integer value
    // Assuming I can make use of Java's linkedlist implementation
    public int get2ndLastNode(LinkedList<Integer> l) {
	int node;
	int index = l.size() - 2;
	node = l.get(index);
	return node;
    }
    
    // Time Complexity: O(N)
    public int getNthNode(LinkedList<Integer> l, int n) {
	int node;
	int index = l.size() - n;
	node = l.get(index);
	return node;
    }
}
