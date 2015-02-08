package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.StrCount;



public class StrCountTest {
    @Test
    public void test1() {
	assertEquals(2, StrCount.strCount("catcowcat", "cat"));
    }
    @Test
    public void test2() {
	assertEquals(1, StrCount.strCount("catcowcat", "cow"));
    }
    @Test
    public void test3() {
	assertEquals(0, StrCount.strCount("catcowcat", "dog"));
    }
    @Test
    public void test4() {
	assertEquals(2, StrCount.strCount("cacatcowcat", "cat"));
    }
    @Test
    public void test5() {
	assertEquals(2, StrCount.strCount("xyx", "x"));
    }
    @Test
    public void test6() {
	assertEquals(4, StrCount.strCount("iiiijj", "i"));
    }
    @Test
    public void test7() {
	assertEquals(2, StrCount.strCount("iiiijj", "ii"));
    }
    @Test
    public void test8() {
	assertEquals(1, StrCount.strCount("iiiijj", "iii"));
    }
    @Test
    public void test9() {
	assertEquals(2, StrCount.strCount("iiiijj", "j"));
    }
    @Test
    public void test10() {
	assertEquals(1, StrCount.strCount("iiiijj", "jj"));
    }
    @Test
    public void test11() {
	assertEquals(4, StrCount.strCount("aaabababab", "ab"));
    }
    @Test
    public void test12() {
	assertEquals(1, StrCount.strCount("aaabababab", "aa"));
    }
    @Test
    public void test13() {
	assertEquals(6, StrCount.strCount("aaabababab", "a"));
    }
    @Test
    public void test14() {
	assertEquals(4, StrCount.strCount("aaabababab", "b"));
    }
}
