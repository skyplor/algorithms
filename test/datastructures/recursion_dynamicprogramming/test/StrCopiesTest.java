package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.StrCopies;

public class StrCopiesTest {
    @Test
    public void test1() {
	assertEquals(true, StrCopies.strCopies("catcowcat", "cat", 2));
    }

    @Test
    public void test2() {
	assertEquals(false, StrCopies.strCopies("catcowcat", "cow", 2));
    }

    @Test
    public void test3() {
	assertEquals(true, StrCopies.strCopies("catcowcat", "cow", 1));
    }

    @Test
    public void test4() {
	assertEquals(true, StrCopies.strCopies("iiijjj", "i", 3));
    }

    @Test
    public void test5() {
	assertEquals(false, StrCopies.strCopies("iiijjj", "i", 4));
    }

    @Test
    public void test6() {
	assertEquals(true, StrCopies.strCopies("iiijjj", "ii", 2));
    }

    @Test
    public void test7() {
	assertEquals(false, StrCopies.strCopies("iiijjj", "ii", 3));
    }

    @Test
    public void test8() {
	assertEquals(false, StrCopies.strCopies("iiijjj", "x", 3));
    }

    @Test
    public void test9() {
	assertEquals(true, StrCopies.strCopies("iiijjj", "x", 0));
    }

    @Test
    public void test10() {
	assertEquals(true, StrCopies.strCopies("iiiiij", "iii", 3));
    }

    @Test
    public void test11() {
	assertEquals(false, StrCopies.strCopies("iiiiij", "iii", 4));
    }

    @Test
    public void test12() {
	assertEquals(true, StrCopies.strCopies("ijiiiiij", "iiii", 2));
    }

    @Test
    public void test13() {
	assertEquals(false, StrCopies.strCopies("ijiiiiij", "iiii", 3));
    }

    @Test
    public void test14() {
	assertEquals(true, StrCopies.strCopies("dogcatdogcat", "dog", 2));
    }
}
