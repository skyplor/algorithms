package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.SplitArray;

public class SplitArrayTest {

    @Test
    public void test1() {
	assertEquals(true, SplitArray.splitArray(new int[] { 2, 2 }));
    }

    @Test
    public void test2() {
	assertEquals(false, SplitArray.splitArray(new int[] { 2, 3 }));
    }

    @Test
    public void test3() {
	assertEquals(true, SplitArray.splitArray(new int[] { 5, 2, 3 }));
    }

    @Test
    public void test4() {
	assertEquals(false, SplitArray.splitArray(new int[] { 5, 2, 2 }));
    }

    @Test
    public void test5() {
	assertEquals(true, SplitArray.splitArray(new int[] { 1, 1, 1, 1, 1, 1 }));
    }

    @Test
    public void test6() {
	assertEquals(false, SplitArray.splitArray(new int[] { 1, 1, 1, 1, 1 }));
    }

    @Test
    public void test7() {
	assertEquals(true, SplitArray.splitArray(new int[] {}));
    }

    @Test
    public void test8() {
	assertEquals(false, SplitArray.splitArray(new int[] { 1 }));
    }

    @Test
    public void test9() {
	assertEquals(false, SplitArray.splitArray(new int[] { 3, 5 }));
    }

    @Test
    public void test10() {
	assertEquals(true, SplitArray.splitArray(new int[] { 5, 3, 2 }));
    }

    @Test
    public void test11() {
	assertEquals(true, SplitArray.splitArray(new int[] { 2, 2, 10, 10, 1, 1 }));
    }

    @Test
    public void test12() {
	assertEquals(false, SplitArray.splitArray(new int[] { 1, 2, 2, 10, 10, 1, 1 }));
    }

    @Test
    public void test13() {
	assertEquals(true, SplitArray.splitArray(new int[] { 1, 2, 3, 10, 10, 1, 1 }));
    }

}
