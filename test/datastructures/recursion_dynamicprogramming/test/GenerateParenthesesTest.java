package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import datastructures.recursion_dynamicprogramming.GenerateParentheses;

public class GenerateParenthesesTest {
    Set<String> expectedSet;

    @Before
    public void setup() {
	expectedSet = new HashSet<String>();
	expectedSet.add("()()()");
	expectedSet.add("(())()");
	expectedSet.add("()(())");
	expectedSet.add("((()))");
	expectedSet.add("(()())");
    }

    @Test
    public void testParentheses() {
	GenerateParentheses parent = new GenerateParentheses();
	Set<String> set = parent.generateParentheses(3);
	assertEquals(5, set.size());
	for (String s : set) {
	    if (!expectedSet.contains(s))
		fail("Should not happen");
	    System.out.println(s);
	}
    }
}
