package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.EndX;

public class EndXTest {
    @Test
    public void test1() {
	assertEquals("rexx", EndX.endX("xxre"));
    }

    @Test
    public void test2() {
	assertEquals("hixxxx", EndX.endX("xxhixx"));
    }

    @Test
    public void test3() {
	assertEquals("hihixxx", EndX.endX("xhixhix"));
    }

    @Test
    public void test4() {
	assertEquals("hiy", EndX.endX("hiy"));
    }

    @Test
    public void test5() {
	assertEquals("h", EndX.endX("h"));
    }

    @Test
    public void test6() {
	assertEquals("x", EndX.endX("x"));
    }

    @Test
    public void test7() {
	assertEquals("xx", EndX.endX("xx"));
    }

    @Test
    public void test8() {
	assertEquals("", EndX.endX(""));
    }

    @Test
    public void test9() {
	assertEquals("bxx", EndX.endX("bxx"));
    }

    @Test
    public void test10() {
	assertEquals("baxx", EndX.endX("bxax"));
    }
    
    @Test
    public void test11() {
	assertEquals("aaaxxx", EndX.endX("axaxax"));
    }
    
    @Test
    public void test12() {
	assertEquals("hixxx", EndX.endX("xxhxi"));
    }
}
