package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import datastructures.recursion_dynamicprogramming.CheckSubString;

public class CheckSubStringTest {

    String main;
    String sub;
    CheckSubString check;

    @Before
    public void setUp() throws Exception {
	check = new CheckSubString();
    }

    @Test
    public void testBatAbate() {
	main = "bbat";
	sub = "ba";
	assertEquals(true, check.isSubstring(main, sub));
    }

    @Test
    public void testBatBeat() {
	main = "bbcd";
	sub = "acd";
	assertEquals(false, check.isSubstring(main, sub));
    }
    
    @Test
    public void testBatB() {
	main = "b";
	sub = "bat";
	assertEquals(false, check.isSubstring(main, sub));
    }
}
