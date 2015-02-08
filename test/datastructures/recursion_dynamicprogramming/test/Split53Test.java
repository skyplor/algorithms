package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Split53;

public class Split53Test {
    @Test
    public void test1() {
	assertEquals(true, Split53.split53(new int[] { 1, 1 }));
    }

    @Test
    public void test2() {
	assertEquals(false, Split53.split53(new int[] { 1, 1, 1 }));
    }

    @Test
    public void test3() {
	assertEquals(true, Split53.split53(new int[] { 2, 4, 2 }));
    }

    @Test
    public void test4() {
	assertEquals(false, Split53.split53(new int[] { 2, 2, 2, 1 }));
    }

    @Test
    public void test5() {
	assertEquals(true, Split53.split53(new int[] { 3, 3, 5, 1 }));
    }

    @Test
    public void test6() {
	assertEquals(false, Split53.split53(new int[] { 3, 5, 8 }));
    }

    @Test
    public void test7() {
	assertEquals(true, Split53.split53(new int[] { 2, 4, 6 }));
    }

    @Test
    public void test8() {
	assertEquals(true, Split53.split53(new int[] { 3, 5, 6, 10, 3, 3 }));
    }

}
