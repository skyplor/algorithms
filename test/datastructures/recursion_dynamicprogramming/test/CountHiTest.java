package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.CountHi;



public class CountHiTest {
    @Test
    public void test1() {
	assertEquals(1, CountHi.countHi("xxhixx"));
    }

    @Test
    public void test2() {
	assertEquals(2, CountHi.countHi("xhixhix"));
    }

    @Test
    public void test3() {
	assertEquals(1, CountHi.countHi("hi"));
    }

    @Test
    public void test4() {
	assertEquals(2, CountHi.countHi("hihih"));
    }

    @Test
    public void test5() {
	assertEquals(0, CountHi.countHi("h"));
    }

    @Test
    public void test6() {
	assertEquals(0, CountHi.countHi(""));
    }

    @Test
    public void test7() {
	assertEquals(4, CountHi.countHi("ihihihihih"));
    }

    @Test
    public void test8() {
	assertEquals(5, CountHi.countHi("ihihihihihi"));
    }
    
    @Test
    public void test9() {
	assertEquals(3, CountHi.countHi("hiAAhi12hi"));
    }
    
    @Test
    public void test10() {
	assertEquals(3, CountHi.countHi("xhixhxihihhhih"));
    }
    
    @Test
    public void test11() {
	assertEquals(1, CountHi.countHi("ship"));
    }
}
