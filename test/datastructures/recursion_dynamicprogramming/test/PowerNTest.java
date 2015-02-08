package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.PowerN;

public class PowerNTest {
    @Test
    public void test1() {
	assertEquals(3, PowerN.powerN(3, 1));
    }

    @Test
    public void test2() {
	assertEquals(9, PowerN.powerN(3, 2));
    }

    @Test
    public void test3() {
	assertEquals(27, PowerN.powerN(3, 3));
    }

    @Test
    public void test4() {
	assertEquals(2, PowerN.powerN(2, 1));
    }

    @Test
    public void test5() {
	assertEquals(4, PowerN.powerN(2, 2));
    }

    @Test
    public void test6() {
	assertEquals(8, PowerN.powerN(2, 3));
    }

    @Test
    public void test7() {
	assertEquals(16, PowerN.powerN(2, 4));
    }

    @Test
    public void test8() {
	assertEquals(32, PowerN.powerN(2, 5));
    }

    @Test
    public void test9() {
	assertEquals(10, PowerN.powerN(10, 1));
    }

    @Test
    public void test10() {
	assertEquals(100, PowerN.powerN(10, 2));
    }

    @Test
    public void test11() {
	assertEquals(1000, PowerN.powerN(10, 3));
    }

}
