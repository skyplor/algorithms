package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Fibonacci;

public class FibonacciTest {

    @Test
    public void test1() {
	assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void test2() {
	assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void test3() {
	assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void test4() {
	assertEquals(2, Fibonacci.fibonacci(3));
    }

    @Test
    public void test5() {
	assertEquals(3, Fibonacci.fibonacci(4));
    }

    @Test
    public void test6() {
	assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    public void test7() {
	assertEquals(8, Fibonacci.fibonacci(6));
    }

    @Test
    public void test8() {
	assertEquals(13, Fibonacci.fibonacci(7));
    }

}
