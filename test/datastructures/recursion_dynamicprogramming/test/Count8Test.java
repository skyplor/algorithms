package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Count8;



public class Count8Test {
    @Test
    public void test1() {
	assertEquals(1, Count8.count8(8));
    }

    @Test
    public void test2() {
	assertEquals(2, Count8.count8(818));
    }

    @Test
    public void test3() {
	assertEquals(4, Count8.count8(8818));
    }

    @Test
    public void test4() {
	assertEquals(4, Count8.count8(8088));
    }

    @Test
    public void test5() {
	assertEquals(0, Count8.count8(123));
    }

    @Test
    public void test6() {
	assertEquals(2, Count8.count8(81238));
    }

    @Test
    public void test7() {
	assertEquals(6, Count8.count8(88788));
    }

    @Test
    public void test8() {
	assertEquals(1, Count8.count8(8234));
    }
    @Test
    public void test9() {
	assertEquals(1, Count8.count8(2348));
    }
    
    @Test
    public void test10() {
	assertEquals(3, Count8.count8(23884));
    }
    
    @Test
    public void test11() {
	assertEquals(0, Count8.count8(0));
    }
    
    @Test
    public void test12() {
	assertEquals(5, Count8.count8(1818188));
    }
    
    @Test
    public void test13() {
	assertEquals(5, Count8.count8(8818181));
    }
    
    @Test
    public void test14() {
	assertEquals(1, Count8.count8(1080));
    }
    
    @Test
    public void test15() {
	assertEquals(3, Count8.count8(188));
    }
    
    @Test
    public void test16() {
	assertEquals(9, Count8.count8(88888));
    }
    
    @Test
    public void test17() {
	assertEquals(2, Count8.count8(9898));
    }
    
    @Test
    public void test18() {
	assertEquals(1, Count8.count8(78));
    }

}
