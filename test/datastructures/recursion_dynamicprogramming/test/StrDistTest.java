package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.StrDist;

public class StrDistTest {
    @Test
    public void test1() {
	assertEquals(9, StrDist.strDist("catcowcat", "cat"));
    }

    @Test
    public void test2() {
	assertEquals(3, StrDist.strDist("catcowcat", "cow"));
    }

    @Test
    public void test3() {
	assertEquals(9, StrDist.strDist("cccatcowcatxx", "cat"));
    }

    @Test
    public void test4() {
	assertEquals(12, StrDist.strDist("abccatcowcatcatxyz", "cat"));
    }

    @Test
    public void test5() {
	assertEquals(3, StrDist.strDist("xyx", "x"));
    }

    @Test
    public void test6() {
	assertEquals(1, StrDist.strDist("xyx", "y"));
    }

    @Test
    public void test7() {
	assertEquals(0, StrDist.strDist("xyx", "z"));
    }

    @Test
    public void test8() {
	assertEquals(1, StrDist.strDist("z", "z"));
    }

    @Test
    public void test9() {
	assertEquals(0, StrDist.strDist("x", "z"));
    }

    @Test
    public void test10() {
	assertEquals(0, StrDist.strDist("", "z"));
    }

    @Test
    public void test11() {
	assertEquals(13, StrDist.strDist("hiHellohihihi", "hi"));
    }

    @Test
    public void test12() {
	assertEquals(5, StrDist.strDist("hiHellohihihi", "hih"));
    }

    @Test
    public void test13() {
	assertEquals(1, StrDist.strDist("hiHellohihihi", "o"));
    }

    @Test
    public void test14() {
	assertEquals(2, StrDist.strDist("hiHellohihihi", "ll"));
    }
}
