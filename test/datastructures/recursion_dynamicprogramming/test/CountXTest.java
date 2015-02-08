package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.CountX;

public class CountXTest {
    @Test
    public void test1() {
	assertEquals(4, CountX.countX("xxhixx"));
    }

    @Test
    public void test2() {
	assertEquals(3, CountX.countX("xhixhix"));
    }

    @Test
    public void test3() {
	assertEquals(0, CountX.countX("hi"));
    }

    @Test
    public void test4() {
	assertEquals(0, CountX.countX("h"));
    }

    @Test
    public void test5() {
	assertEquals(1, CountX.countX("x"));
    }

    @Test
    public void test6() {
	assertEquals(0, CountX.countX(""));
    }

    @Test
    public void test7() {
	assertEquals(0, CountX.countX("hihi"));
    }

    @Test
    public void test8() {
	assertEquals(0, CountX.countX("hiAAhi12hi"));
    }

}
