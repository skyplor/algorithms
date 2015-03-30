package datastructures.questions.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import datastructures.questions.FindNodesInLinkedList;

public class FindNodesInLinkedListTest {
    
    LinkedList<Integer> l;
    FindNodesInLinkedList fn;
    
    @Before
    public void setUp() throws Exception {
	l = new LinkedList<Integer>();
	l.add(0);
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	l.add(6);
	fn = new FindNodesInLinkedList();
    }

    @Test
    public void testGet2ndLastNode(){
	assertEquals(5,fn.get2ndLastNode(l));
    }
    
    @Test
    public void testGetNthNode(){
	assertEquals(3,fn.getNthNode(l,4));
    }
}
