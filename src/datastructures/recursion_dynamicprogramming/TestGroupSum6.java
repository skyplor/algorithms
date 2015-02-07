package datastructures.recursion_dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGroupSum6 {

    @Test
    public void test1() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{5, 6, 2}, 8));
    }
    @Test
    public void test2() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{5, 6, 2}, 9));
    }
    @Test
    public void test3() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{5, 6, 2}, 7));
    }
    @Test
    public void test4() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{1}, 1));
    }
    @Test
    public void test5() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{9}, 1));
    }
    @Test
    public void test6() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{}, 0));
    }
    
    @Test
    public void test7() {
	assertEquals(true,  GroupSum6.groupSum6(0, new int[]{3, 2, 4, 6}, 8));
    }
    @Test
    public void test8() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{6, 2, 4, 3}, 8));
    }
    @Test
    public void test9() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{5, 2, 4, 6}, 9));
    }
    @Test
    public void test10() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{6, 2, 4, 5}, 9));
    }
    @Test
    public void test11() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{3, 2, 4, 6}, 3));
    }
    @Test
    public void test12() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 12));
    }
    
    @Test
    public void test13() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 13));
    }
    @Test
    public void test14() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 4));
    }
    @Test
    public void test15() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 9));
    }
    @Test
    public void test16() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 14));
    }
    @Test
    public void test17() {
	assertEquals(true,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 15));
    }
    @Test
    public void test18() {
	assertEquals(false,GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 16));
    }

}
