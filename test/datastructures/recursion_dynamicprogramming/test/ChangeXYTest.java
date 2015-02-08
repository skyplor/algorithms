package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.ChangeXY;

public class ChangeXYTest {
    @Test
    public void test1() {
	assertEquals("codey", ChangeXY.changeXY("codex"));
    }

    @Test
    public void test2() {
	assertEquals("yyhiyy", ChangeXY.changeXY("xxhixx"));
    }

    @Test
    public void test3() {
	assertEquals("yhiyhiy", ChangeXY.changeXY("xhixhix"));
    }

    @Test
    public void test4() {
	assertEquals("hiy", ChangeXY.changeXY("hiy"));
    }

    @Test
    public void test5() {
	assertEquals("h", ChangeXY.changeXY("h"));
    }

    @Test
    public void test6() {
	assertEquals("y", ChangeXY.changeXY("x"));
    }

    @Test
    public void test7() {
	assertEquals("", ChangeXY.changeXY(""));
    }

    @Test
    public void test8() {
	assertEquals("yyy", ChangeXY.changeXY("xxx"));
    }
    
    @Test
    public void test9() {
	assertEquals("yyhyyi", ChangeXY.changeXY("yyhxyi"));
    }
    
    @Test
    public void test10() {
	assertEquals("hihi", ChangeXY.changeXY("hihi"));
    }
}
