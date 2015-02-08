package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.SplitOdd10;

public class SplitOdd10Test {
    @Test
    public void test1() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] { 5, 5, 5 }));
    }

    @Test
    public void test2() {
	assertEquals(false, SplitOdd10.splitOdd10(new int[] { 5, 5, 6 }));
    }

    @Test
    public void test3() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] { 5, 5, 6, 1 }));
    }

    @Test
    public void test4() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] { 6, 5, 5, 1 }));
    }

    @Test
    public void test5() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] { 6, 5, 5, 1, 10 }));
    }

    @Test
    public void test6() {
	assertEquals(false, SplitOdd10.splitOdd10(new int[] { 6, 5, 5, 5, 1 }));
    }

    @Test
    public void test7() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] {1}));
    }

    @Test
    public void test8() {
	assertEquals(false, SplitOdd10.splitOdd10(new int[] { }));
    }

    @Test
    public void test9() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] { 10, 7, 5, 5 }));
    }

    @Test
    public void test10() {
	assertEquals(false, SplitOdd10.splitOdd10(new int[] { 10, 0, 5, 5 }));
    }

    @Test
    public void test11() {
	assertEquals(true, SplitOdd10.splitOdd10(new int[] { 10, 7, 5, 5, 2 }));
    }

    @Test
    public void test12() {
	assertEquals(false, SplitOdd10.splitOdd10(new int[] { 10, 7, 5, 5, 1 }));
    }

}
