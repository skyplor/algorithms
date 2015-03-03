package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import datastructures.recursion_dynamicprogramming.ReverseLinkedList;
import datastructures.recursion_dynamicprogramming.ReverseLinkedList.Node;

public class ReverseLinkedListTest {
    ReverseLinkedList reverse;
    Node n1, n2, n3, n4, n5;

    @Before
    public void setUp() throws Exception {
	reverse = new ReverseLinkedList();
	n1 = reverse.new Node();
	n1.value = '1';
	n2 = reverse.new Node();
	n2.value = '2';
	n3 = reverse.new Node();
	n3.value = '3';
	n4 = reverse.new Node();
	n4.value = '4';
	n5 = reverse.new Node();
	n5.value = '5';
	n1.next = n2;
	n2.next = n3;
	n3.next = n4;
	n4.next = n5;
	n5.next = null;
    }

    @Test
    public void testReverseList() {
	Node rev = reverse.reverseList(n1);
	
	assertEquals('5', rev.value);
	rev = rev.next;
	assertEquals('4', rev.value);
	rev = rev.next;
	assertEquals('3', rev.value);
	rev = rev.next;
	assertEquals('2', rev.value);
	rev = rev.next;
	assertEquals('1', rev.value);
	rev = rev.next;
    }
}
