package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.FibonacciDP;

public class FibonacciDPTest {
    @Test
    public void test1() {
	assertEquals(0L, FibonacciDP.fib(0));
    }

    @Test
    public void test2() {
	assertEquals(1L, FibonacciDP.fib(1));
    }

    @Test
    public void test3() {
	assertEquals(1L, FibonacciDP.fib(2));
    }

    @Test
    public void test4() {
	assertEquals(2L, FibonacciDP.fib(3));
    }

    @Test
    public void test5() {
	assertEquals(3L, FibonacciDP.fib(4));
    }

    @Test
    public void test6() {
	assertEquals(5L, FibonacciDP.fib(5));
    }

    @Test
    public void test7() {
	assertEquals(8L, FibonacciDP.fib(6));
    }

    @Test
    public void test8() {
	assertEquals(13L, FibonacciDP.fib(7));
    }

    @Test
    public void test9() {
	assertEquals(267914296L, FibonacciDP.fib(42));
    }

    @Test
    public void test10() {
	assertEquals(190392490709135L, FibonacciDP.fib(70));
    }

}
