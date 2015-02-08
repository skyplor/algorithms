package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.StringClean;

public class StringCleanTest {
    @Test
    public void test1() {
	assertEquals("yza", StringClean.stringClean("yyzzza"));
    }

    @Test
    public void test2() {
	assertEquals("abcd", StringClean.stringClean("abbbcdd"));
    }

    @Test
    public void test3() {
	assertEquals("Helo", StringClean.stringClean("Hello"));
    }

    @Test
    public void test4() {
	assertEquals("XabcY", StringClean.stringClean("XXabcYY"));
    }

    @Test
    public void test5() {
	assertEquals("12ab45", StringClean.stringClean("112ab445"));
    }

    @Test
    public void test6() {
	assertEquals("Helo Bokeper", StringClean.stringClean("Hello Bookkeeper"));
    }
}
