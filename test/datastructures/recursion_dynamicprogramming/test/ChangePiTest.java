package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.ChangePi;

public class ChangePiTest {
    @Test
    public void test1() {
	assertEquals("x3.14x", ChangePi.changePi("xpix"));
    }

    @Test
    public void test2() {
	assertEquals("3.143.14", ChangePi.changePi("pipi"));
    }

    @Test
    public void test3() {
	assertEquals("3.14p", ChangePi.changePi("pip"));
    }

    @Test
    public void test4() {
	assertEquals("3.14", ChangePi.changePi("pi"));
    }

    @Test
    public void test5() {
	assertEquals("hip", ChangePi.changePi("hip"));
    }

    @Test
    public void test6() {
	assertEquals("p", ChangePi.changePi("p"));
    }

    @Test
    public void test7() {
	assertEquals("x", ChangePi.changePi("x"));
    }

    @Test
    public void test8() {
	assertEquals("", ChangePi.changePi(""));
    }

    @Test
    public void test9() {
	assertEquals("3.14xx", ChangePi.changePi("pixx"));
    }

    @Test
    public void test10() {
	assertEquals("xyzzy", ChangePi.changePi("xyzzy"));
    }
}
