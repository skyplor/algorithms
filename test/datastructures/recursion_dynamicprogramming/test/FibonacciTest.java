package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Fibonacci;

public class FibonacciTest {

    @Test
    public void test1() {
	assertEquals(0L, Fibonacci.fibonacci(0));
    }

    @Test
    public void test2() {
	assertEquals(1L, Fibonacci.fibonacci(1));
    }

    @Test
    public void test3() {
	assertEquals(1L, Fibonacci.fibonacci(2));
    }

    @Test
    public void test4() {
	assertEquals(2L, Fibonacci.fibonacci(3));
    }

    @Test
    public void test5() {
	assertEquals(3L, Fibonacci.fibonacci(4));
    }

    @Test
    public void test6() {
	assertEquals(5L, Fibonacci.fibonacci(5));
    }

    @Test
    public void test7() {
	assertEquals(8L, Fibonacci.fibonacci(6));
    }

    @Test
    public void test8() {
	assertEquals(13L, Fibonacci.fibonacci(7));
    }
    
    @Test
    public void test9() {
	assertEquals(267914296L, Fibonacci.fibonacci(42));
    }
    
    @Test
    public void test10() {
	assertEquals(190392490709135L, Fibonacci.fibonacci(70));
    }

}
