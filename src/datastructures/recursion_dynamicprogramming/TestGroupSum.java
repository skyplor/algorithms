package datastructures.recursion_dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGroupSum {

    @Test
    public void test1() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 2, 4, 8 }, 10));
    }

    @Test
    public void test2() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 2, 4, 8 }, 14));
    }

    @Test
    public void test3() {
	assertEquals(false, GroupSum.groupSum(0, new int[] { 2, 4, 8 }, 9));
    }

    @Test
    public void test4() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 2, 4, 8 }, 8));
    }

    @Test
    public void test5() {
	assertEquals(true, GroupSum.groupSum(1, new int[] { 2, 4, 8 }, 8));
    }

    @Test
    public void test6() {
	assertEquals(false, GroupSum.groupSum(1, new int[] { 2, 4, 8 }, 2));
    }

    @Test
    public void test7() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 1 }, 1));
    }

    @Test
    public void test8() {
	assertEquals(false, GroupSum.groupSum(0, new int[] { 9 }, 1));
    }

    @Test
    public void test9() {
	assertEquals(true, GroupSum.groupSum(1, new int[] { 9 }, 0));
    }

    @Test
    public void test10() {
	assertEquals(true, GroupSum.groupSum(0, new int[] {}, 0));
    }

    @Test
    public void test11() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 10, 2, 2, 5 }, 17));
    }

    @Test
    public void test12() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 10, 2, 2, 5 }, 15));
    }

    @Test
    public void test13() {
	assertEquals(true, GroupSum.groupSum(0, new int[] { 10, 2, 2, 5 }, 9));
    }

}
