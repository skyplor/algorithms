package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.CountAbc;

public class CountAbcTest {
    @Test
    public void test1() {
	assertEquals(1, CountAbc.countAbc("abc"));
    }

    @Test
    public void test2() {
	assertEquals(2, CountAbc.countAbc("abcxxabc"));
    }

    @Test
    public void test3() {
	assertEquals(2, CountAbc.countAbc("abaxxaba"));
    }

    @Test
    public void test4() {
	assertEquals(2, CountAbc.countAbc("ababc"));
    }

    @Test
    public void test5() {
	assertEquals(0, CountAbc.countAbc("abxbc"));
    }

    @Test
    public void test6() {
	assertEquals(1, CountAbc.countAbc("aaabc"));
    }

    @Test
    public void test7() {
	assertEquals(0, CountAbc.countAbc("hello"));
    }

    @Test
    public void test8() {
	assertEquals(0, CountAbc.countAbc(""));
    }

    @Test
    public void test9() {
	assertEquals(0, CountAbc.countAbc("ab"));
    }

    @Test
    public void test10() {
	assertEquals(1, CountAbc.countAbc("aba"));
    }

    @Test
    public void test11() {
	assertEquals(0, CountAbc.countAbc("aca"));
    }
    
    @Test
    public void test12() {
	assertEquals(0, CountAbc.countAbc("aaa"));
    }
}
