package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.BunnyEars;

public class BunnyEarsTest {

    @Test
    public void test1() {
	assertEquals(0, BunnyEars.bunnyEars(0));
    }

    @Test
    public void test2() {
	assertEquals(2, BunnyEars.bunnyEars(1));
    }

    @Test
    public void test3() {
	assertEquals(4, BunnyEars.bunnyEars(2));
    }

    @Test
    public void test4() {
	assertEquals(6, BunnyEars.bunnyEars(3));
    }

    @Test
    public void test5() {
	assertEquals(8, BunnyEars.bunnyEars(4));
    }

    @Test
    public void test6() {
	assertEquals(10, BunnyEars.bunnyEars(5));
    }

    @Test
    public void test7() {
	assertEquals(24, BunnyEars.bunnyEars(12));
    }

    @Test
    public void test8() {
	assertEquals(100, BunnyEars.bunnyEars(50));
    }

    @Test
    public void test9() {
	assertEquals(468, BunnyEars.bunnyEars(234));
    }

}
