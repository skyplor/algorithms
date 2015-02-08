package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.SumDigits;



public class SumDigitsTest {
    @Test
    public void test1() {
	assertEquals(9, SumDigits.sumDigits(126));
    }

    @Test
    public void test2() {
	assertEquals(13, SumDigits.sumDigits(49));
    }

    @Test
    public void test3() {
	assertEquals(3, SumDigits.sumDigits(12));
    }

    @Test
    public void test4() {
	assertEquals(1, SumDigits.sumDigits(10));
    }

    @Test
    public void test5() {
	assertEquals(1, SumDigits.sumDigits(1));
    }

    @Test
    public void test6() {
	assertEquals(0, SumDigits.sumDigits(0));
    }

    @Test
    public void test7() {
	assertEquals(10, SumDigits.sumDigits(730));
    }

    @Test
    public void test8() {
	assertEquals(4, SumDigits.sumDigits(1111));
    }
    
    @Test
    public void test9() {
	assertEquals(5, SumDigits.sumDigits(11111));
    }
    
    @Test
    public void test10() {
	assertEquals(3, SumDigits.sumDigits(10110));
    }
    
    @Test
    public void test11() {
	assertEquals(10, SumDigits.sumDigits(235));
    }

}
