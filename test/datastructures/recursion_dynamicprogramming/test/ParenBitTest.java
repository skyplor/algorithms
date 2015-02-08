package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.ParenBit;



public class ParenBitTest {
    @Test
    public void test1() {
	assertEquals("(abc)", ParenBit.parenBit("xyz(abc)123"));
    }

    @Test
    public void test2() {
	assertEquals("(hello)", ParenBit.parenBit("x(hello)"));
    }

    @Test
    public void test3() {
	assertEquals("(xy)", ParenBit.parenBit("(xy)1"));
    }

    @Test
    public void test4() {
	assertEquals("(possible)", ParenBit.parenBit("not really (possible)"));
    }

    @Test
    public void test5() {
	assertEquals("(abc)", ParenBit.parenBit("(abc)"));
    }

    @Test
    public void test6() {
	assertEquals("(abc)", ParenBit.parenBit("(abc)xyz"));
    }
    @Test
    public void test7() {
	assertEquals("(abc)", ParenBit.parenBit("(abc)x"));
    }

    @Test
    public void test8() {
	assertEquals("(x)", ParenBit.parenBit("(x)"));
    }

    @Test
    public void test9() {
	assertEquals("()", ParenBit.parenBit("()"));
    }

    @Test
    public void test10() {
	assertEquals("(ipsa)", ParenBit.parenBit("res (ipsa) loquitor"));
    }

    @Test
    public void test11() {
	assertEquals("(not really)", ParenBit.parenBit("hello(not really)there"));
    }

    @Test
    public void test12() {
	assertEquals("(ab)", ParenBit.parenBit("ab(ab)ab"));
    }
}
