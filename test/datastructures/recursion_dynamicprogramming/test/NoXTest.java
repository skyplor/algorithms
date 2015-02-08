package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.NoX;

public class NoXTest {
    @Test
    public void test1() {
	assertEquals("ab", NoX.noX("xaxb"));
    }

    @Test
    public void test2() {
	assertEquals("abc", NoX.noX("abc"));
    }

    @Test
    public void test3() {
	assertEquals("", NoX.noX("xx"));
    }

    @Test
    public void test4() {
	assertEquals("", NoX.noX(""));
    }

    @Test
    public void test5() {
	assertEquals("ab", NoX.noX("axxbxx"));
    }

    @Test
    public void test6() {
	assertEquals("Hello", NoX.noX("Hellox"));
    }
}
