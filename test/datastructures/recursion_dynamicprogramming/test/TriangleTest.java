package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Triangle;



public class TriangleTest {
    @Test
    public void test1() {
	assertEquals(0, Triangle.triangle(0));
    }

    @Test
    public void test2() {
	assertEquals(1, Triangle.triangle(1));
    }

    @Test
    public void test3() {
	assertEquals(3, Triangle.triangle(2));
    }

    @Test
    public void test4() {
	assertEquals(6, Triangle.triangle(3));
    }

    @Test
    public void test5() {
	assertEquals(10, Triangle.triangle(4));
    }

    @Test
    public void test6() {
	assertEquals(15, Triangle.triangle(5));
    }

    @Test
    public void test7() {
	assertEquals(21, Triangle.triangle(6));
    }

    @Test
    public void test8() {
	assertEquals(28, Triangle.triangle(7));
    }

}
