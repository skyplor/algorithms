package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Count11;

public class Count11Test {
    @Test
    public void test1() {
	assertEquals(2, Count11.count11("11abc11"));
    }

    @Test
    public void test2() {
	assertEquals(3, Count11.count11("abc11x11x11"));
    }

    @Test
    public void test3() {
	assertEquals(1, Count11.count11("111"));
    }

    @Test
    public void test4() {
	assertEquals(2, Count11.count11("1111"));
    }

    @Test
    public void test5() {
	assertEquals(0, Count11.count11("1"));
    }

    @Test
    public void test6() {
	assertEquals(0, Count11.count11(""));
    }

    @Test
    public void test7() {
	assertEquals(0, Count11.count11("hi"));
    }

    @Test
    public void test8() {
	assertEquals(4, Count11.count11("11x111x1111"));
    }

    @Test
    public void test9() {
	assertEquals(1, Count11.count11("1x111"));
    }

    @Test
    public void test10() {
	assertEquals(0, Count11.count11("1Hello1"));
    }

    @Test
    public void test11() {
	assertEquals(0, Count11.count11("Hello"));
    }
}
