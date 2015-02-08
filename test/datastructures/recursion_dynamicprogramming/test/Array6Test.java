package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Array6;

public class Array6Test {
    @Test
    public void test1() {
	assertEquals(true, Array6.array6(new int[] { 1,6,4 },0));
    }
    @Test
    public void test2() {
	assertEquals(false, Array6.array6(new int[] { 1,4 },0));
    }
    @Test
    public void test3() {
	assertEquals(true, Array6.array6(new int[] { 6 },0));
    }
    @Test
    public void test4() {
	assertEquals(false, Array6.array6(new int[] {  },0));
    }
    @Test
    public void test5() {
	assertEquals(true, Array6.array6(new int[] { 6, 2, 2 },0));
    }
    @Test
    public void test6() {
	assertEquals(false, Array6.array6(new int[] { 2, 5 },0));
    }
    @Test
    public void test7() {
	assertEquals(true, Array6.array6(new int[] { 1, 9, 4, 6, 6 },0));
    }
    @Test
    public void test8() {
	assertEquals(true, Array6.array6(new int[] { 2, 5, 6 },0));
    }

}
