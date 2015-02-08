package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.GroupSum5;

public class GroupSum5Test {

    @Test
    public void test1() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 19));
    }

    @Test
    public void test2() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 17));
    }

    @Test
    public void test3() {
	assertEquals(false, GroupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 12));
    }

    @Test
    public void test4() {
	assertEquals(false, GroupSum5.groupSum5(0, new int[] { 2, 5, 4, 10 }, 12));
    }

    @Test
    public void test5() {
	assertEquals(false, GroupSum5.groupSum5(1, new int[] { 3, 5, 1 }, 4));
    }

    @Test
    public void test6() {
	assertEquals(true, GroupSum5.groupSum5(1, new int[] { 3, 5, 1 }, 5));
    }

    @Test
    public void test7() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] { 1, 3, 5 }, 5));
    }

    @Test
    public void test8() {
	assertEquals(false, GroupSum5.groupSum5(0, new int[] { 3, 5, 1 }, 9));
    }

    @Test
    public void test9() {
	assertEquals(false, GroupSum5.groupSum5(1, new int[] { 2, 5, 10, 4 }, 7));
    }

    @Test
    public void test10() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 15));
    }

    @Test
    public void test11() {
	assertEquals(false, GroupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 11));
    }

    @Test
    public void test12() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] { 1 }, 1));
    }

    @Test
    public void test13() {
	assertEquals(false, GroupSum5.groupSum5(0, new int[] { 9 }, 1));
    }

    @Test
    public void test14() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] { 9 }, 0));
    }

    @Test
    public void test15() {
	assertEquals(true, GroupSum5.groupSum5(0, new int[] {}, 0));
    }

}
