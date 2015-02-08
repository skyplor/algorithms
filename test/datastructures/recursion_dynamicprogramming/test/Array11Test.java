package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Array11;

public class Array11Test {
    @Test
    public void test1() {
	assertEquals(1, Array11.array11(new int[] { 1, 2, 11 }, 0));
    }

    @Test
    public void test2() {
	assertEquals(2, Array11.array11(new int[] { 11, 11}, 0));
    }

    @Test
    public void test3() {
	assertEquals(0, Array11.array11(new int[] { 1, 2, 3, 4 }, 0));
    }

    @Test
    public void test4() {
	assertEquals(3, Array11.array11(new int[] {1, 11, 3, 11, 11}, 0));
    }

    @Test
    public void test5() {
	assertEquals(1, Array11.array11(new int[] { 11 }, 0));
    }

    @Test
    public void test6() {
	assertEquals(0, Array11.array11(new int[] { 1 }, 0));
    }

    @Test
    public void test7() {
	assertEquals(0, Array11.array11(new int[] { }, 0));
    }

    @Test
    public void test8() {
	assertEquals(2, Array11.array11(new int[] { 11, 2, 3, 4, 11, 5 }, 0));
    }
    
    @Test
    public void test9() {
	assertEquals(2, Array11.array11(new int[] { 11, 5, 11 }, 0));
    }
}
