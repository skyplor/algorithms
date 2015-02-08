package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.CountHi2;

public class CountHi2Test {
    @Test
    public void test1() {
	assertEquals(1, CountHi2.countHi2("ahixhi"));
    }

    @Test
    public void test2() {
	assertEquals(2, CountHi2.countHi2("ahibhi"));
    }

    @Test
    public void test3() {
	assertEquals(0, CountHi2.countHi2("xhixhi"));
    }

    @Test
    public void test4() {
	assertEquals(1, CountHi2.countHi2("hixhi"));
    }

    @Test
    public void test5() {
	assertEquals(2, CountHi2.countHi2("hixhhi"));
    }

    @Test
    public void test6() {
	assertEquals(3, CountHi2.countHi2("hihihi"));
    }

    @Test
    public void test7() {
	assertEquals(3, CountHi2.countHi2("hihihix"));
    }

    @Test
    public void test8() {
	assertEquals(2, CountHi2.countHi2("xhihihix"));
    }

    @Test
    public void test9() {
	assertEquals(0, CountHi2.countHi2("xxhi"));
    }

    @Test
    public void test10() {
	assertEquals(1, CountHi2.countHi2("hixxhi"));
    }

    @Test
    public void test11() {
	assertEquals(1, CountHi2.countHi2("hi"));
    }
    
    @Test
    public void test12() {
	assertEquals(0, CountHi2.countHi2("xxxx"));
    }
    
    @Test
    public void test13() {
	assertEquals(0, CountHi2.countHi2("h"));
    }
    
    @Test
    public void test14() {
	assertEquals(0, CountHi2.countHi2("x"));
    }
    
    @Test
    public void test15() {
	assertEquals(0, CountHi2.countHi2(""));
    }
    
    @Test
    public void test16() {
	assertEquals(1, CountHi2.countHi2("Hellohi"));
    }
}
