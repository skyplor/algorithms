package datastructures.questions.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datastructures.implementations.MyBinaryTreeImpl;
import datastructures.questions.PrintLeftViewBinaryTree;

public class PrintLeftViewBinaryTreeTest {
    MyBinaryTreeImpl<Integer> btree;
    PrintLeftViewBinaryTree printLeft;
    List<Integer> compareList;

    @Before
    public void setUp() throws Exception {
	// Build a tree
	btree = new MyBinaryTreeImpl<Integer>();
	btree.insert(12);
	btree.insert(10);
	btree.insert(30);
	btree.insert(null);
	btree.insert(13);
	btree.insert(25);
	btree.insert(40);
	printLeft = new PrintLeftViewBinaryTree();
	compareList = new ArrayList<Integer>();
	compareList.add(12);
	compareList.add(10);
	compareList.add(25);
    }

    @Test
    public void testLeftView() {
	List<Integer> l = printLeft.leftViewTree(btree.getRoot());
	assertEquals(compareList, l);
    }
}
