package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.GroupSumClump;

public class GroupSumClumpTest {

    @Test
    public void test1() {
	assertEquals(true, GroupSumClump.groupSumClump(0, new int[] { 2, 4, 8 }, 10));
    }

    @Test
    public void test2() {
	assertEquals(true, GroupSumClump.groupSumClump(0, new int[] { 1, 2, 4, 8, 1 }, 14));
    }

    @Test
    public void test3() {
	assertEquals(false, GroupSumClump.groupSumClump(0, new int[] { 2, 4, 4, 8 }, 14));
    }

    @Test
    public void test4() {
	assertEquals(true, GroupSumClump.groupSumClump(0, new int[] { 8, 2, 2, 1 }, 9));
    }

    @Test
    public void test5() {
	assertEquals(false, GroupSumClump.groupSumClump(0, new int[] { 8, 2, 2, 1 }, 11));
    }

    @Test
    public void test6() {
	assertEquals(true, GroupSumClump.groupSumClump(0, new int[] { 1 }, 1));
    }

    @Test
    public void test7() {
	assertEquals(false, GroupSumClump.groupSumClump(0, new int[] { 9 }, 1));
    }

    @Test
    public void test8() {
	assertEquals(false, GroupSumClump.groupSumClump(0, new int[] { 1, 2, 2, 2, 5, 2 }, 10));
    }

}
