package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.AllStar;

public class AllStarTest {
    @Test
    public void test1() {
	assertEquals("h*e*l*l*o", AllStar.allStar("hello"));
    }

    @Test
    public void test2() {
	assertEquals("a*b*c", AllStar.allStar("abc"));
    }

    @Test
    public void test3() {
	assertEquals("a*b", AllStar.allStar("ab"));
    }

    @Test
    public void test4() {
	assertEquals("a", AllStar.allStar("a"));
    }

    @Test
    public void test5() {
	assertEquals("", AllStar.allStar(""));
    }

    @Test
    public void test6() {
	assertEquals("3*.*1*4", AllStar.allStar("3.14"));
    }

    @Test
    public void test7() {
	assertEquals("C*h*o*c*o*l*a*t*e", AllStar.allStar("Chocolate"));
    }

    @Test
    public void test8() {
	assertEquals("1*2*3*4", AllStar.allStar("1234"));
    }
}
