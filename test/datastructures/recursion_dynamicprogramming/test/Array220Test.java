package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Array220;

public class Array220Test {
    @Test
    public void test1() {
	assertEquals(true, Array220.array220(new int[] { 1, 2, 20 }, 0));
    }

    @Test
    public void test2() {
	assertEquals(true, Array220.array220(new int[] { 3, 30 }, 0));
    }

    @Test
    public void test3() {
	assertEquals(false, Array220.array220(new int[] { 3 }, 0));
    }

    @Test
    public void test4() {
	assertEquals(false, Array220.array220(new int[] {}, 0));
    }

    @Test
    public void test5() {
	assertEquals(true, Array220.array220(new int[] { 3, 3, 30, 4 }, 0));
    }

    @Test
    public void test6() {
	assertEquals(false, Array220.array220(new int[] { 2, 19, 4 }, 0));
    }

    @Test
    public void test7() {
	assertEquals(false, Array220.array220(new int[] { 20, 2, 21 }, 0));
    }

    @Test
    public void test8() {
	assertEquals(true, Array220.array220(new int[] { 20, 2, 21, 210}, 0));
    }
    
    @Test
    public void test9() {
	assertEquals(true, Array220.array220(new int[] { 2, 200, 2000 }, 0));
    }
    
    @Test
    public void test10() {
	assertEquals(true, Array220.array220(new int[] {0, 0}, 0));
    }
    
    @Test
    public void test11() {
	assertEquals(false, Array220.array220(new int[] { 1, 2, 3, 4, 5, 6 }, 0));
    }
    
    @Test
    public void test12() {
	assertEquals(true, Array220.array220(new int[] { 1, 2, 3, 4, 5, 50, 6 }, 0));
    }
    
    @Test
    public void test13() {
	assertEquals(false, Array220.array220(new int[] { 1, 2, 3, 4, 5, 51, 6 }, 0));
    }
    
    @Test
    public void test14() {
	assertEquals(true, Array220.array220(new int[] { 1, 2, 3, 4, 4, 50, 500, 6 }, 0));
    }
}
