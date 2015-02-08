package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.PairStar;

public class PairStarTest {
    @Test
    public void test1() {
	assertEquals("hel*lo", PairStar.pairStar("hello"));
    }

    @Test
    public void test2() {
	assertEquals("x*xy*y", PairStar.pairStar("xxyy"));
    }

    @Test
    public void test3() {
	assertEquals("a*a*a*a", PairStar.pairStar("aaaa"));
    }

    @Test
    public void test4() {
	assertEquals("a*a*ab", PairStar.pairStar("aaab"));
    }

    @Test
    public void test5() {
	assertEquals("a*a", PairStar.pairStar("aa"));
    }

    @Test
    public void test6() {
	assertEquals("a", PairStar.pairStar("a"));
    }

    @Test
    public void test7() {
	assertEquals("", PairStar.pairStar(""));
    }

    @Test
    public void test8() {
	assertEquals("noadjacent", PairStar.pairStar("noadjacent"));
    }
    
    @Test
    public void test9() {
	assertEquals("ab*ba", PairStar.pairStar("abba"));
    }
    
    @Test
    public void test10() {
	assertEquals("ab*b*ba", PairStar.pairStar("abbba"));
    }
}
