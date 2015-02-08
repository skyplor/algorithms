package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.Count7;

public class Count7Test {
    @Test
    public void test1() {
	assertEquals(2, Count7.count7(717));
    }

    @Test
    public void test2() {
	assertEquals(1, Count7.count7(7));
    }

    @Test
    public void test3() {
	assertEquals(0, Count7.count7(123));
    }

    @Test
    public void test4() {
	assertEquals(2, Count7.count7(77));
    }

    @Test
    public void test5() {
	assertEquals(1, Count7.count7(7123));
    }

    @Test
    public void test6() {
	assertEquals(3, Count7.count7(771237));
    }

    @Test
    public void test7() {
	assertEquals(4, Count7.count7(771737));
    }

    @Test
    public void test8() {
	assertEquals(2, Count7.count7(47571));
    }
    
    @Test
    public void test9() {
	assertEquals(6, Count7.count7(777777));
    }
    
    @Test
    public void test10() {
	assertEquals(4, Count7.count7(70701277));
    }
    
    @Test
    public void test11() {
	assertEquals(5, Count7.count7(777576197));
    }
    
    @Test
    public void test12() {
	assertEquals(0, Count7.count7(99999));
    }
    
    @Test
    public void test13() {
	assertEquals(1, Count7.count7(99799));
    }

}
