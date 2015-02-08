package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Factorial;

public class FactorialTest {

    @Test
    public void test1() {
	assertEquals(1,Factorial.factorial(1));
    }
    @Test
    public void test2() {
	assertEquals(2,Factorial.factorial(2));
    }
    @Test
    public void test3() {
	assertEquals(6,Factorial.factorial(3));
    }
    @Test
    public void test4() {
	assertEquals(24,Factorial.factorial(4));
    }
    @Test
    public void test5() {
	assertEquals(120,Factorial.factorial(5));
    }
    @Test
    public void test6() {
	assertEquals(720,Factorial.factorial(6));
    }
    @Test
    public void test7() {
	assertEquals(5040,Factorial.factorial(7));
    }
    @Test
    public void test8() {
	assertEquals(40320,Factorial.factorial(8));
    }
    @Test
    public void test9() {
	assertEquals(479001600,Factorial.factorial(12));
    }

}
