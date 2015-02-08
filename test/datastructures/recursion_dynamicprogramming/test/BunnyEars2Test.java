package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.BunnyEars2;

public class BunnyEars2Test {
    @Test
    public void test1() {
	assertEquals(0, BunnyEars2.bunnyEars2(0));
    }

    @Test
    public void test2() {
	assertEquals(2, BunnyEars2.bunnyEars2(1));
    }

    @Test
    public void test3() {
	assertEquals(5, BunnyEars2.bunnyEars2(2));
    }

    @Test
    public void test4() {
	assertEquals(7, BunnyEars2.bunnyEars2(3));
    }

    @Test
    public void test5() {
	assertEquals(10, BunnyEars2.bunnyEars2(4));
    }

    @Test
    public void test6() {
	assertEquals(12, BunnyEars2.bunnyEars2(5));
    }

    @Test
    public void test7() {
	assertEquals(15, BunnyEars2.bunnyEars2(6));
    }

    @Test
    public void test8() {
	assertEquals(25, BunnyEars2.bunnyEars2(10));
    }

}
