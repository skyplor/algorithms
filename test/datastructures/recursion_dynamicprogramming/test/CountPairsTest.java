package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.CountPairs;

public class CountPairsTest {
    @Test
    public void test1() {
	assertEquals(1, CountPairs.countPairs("axa"));
    }

    @Test
    public void test2() {
	assertEquals(2, CountPairs.countPairs("axax"));
    }

    @Test
    public void test3() {
	assertEquals(1, CountPairs.countPairs("axbx"));
    }

    @Test
    public void test4() {
	assertEquals(0, CountPairs.countPairs("hi"));
    }

    @Test
    public void test5() {
	assertEquals(3, CountPairs.countPairs("hihih"));
    }

    @Test
    public void test6() {
	assertEquals(3, CountPairs.countPairs("ihihhh"));
    }

    @Test
    public void test7() {
	assertEquals(0, CountPairs.countPairs("ihjxhh"));
    }

    @Test
    public void test8() {
	assertEquals(0, CountPairs.countPairs(""));
    }

    @Test
    public void test9() {
	assertEquals(0, CountPairs.countPairs("a"));
    }

    @Test
    public void test10() {
	assertEquals(0, CountPairs.countPairs("aa"));
    }

    @Test
    public void test11() {
	assertEquals(1, CountPairs.countPairs("aaa"));
    }
}
