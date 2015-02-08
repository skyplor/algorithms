package datastructures.recursion_dynamicprogramming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.recursion_dynamicprogramming.NestParen;



public class NestParenTest {
    @Test
    public void test1() {
	assertEquals(true, NestParen.nestParen("(())"));
    }

    @Test
    public void test2() {
	assertEquals(true, NestParen.nestParen("((()))"));
    }

    @Test
    public void test3() {
	assertEquals(false, NestParen.nestParen("(((x))"));
    }

    @Test
    public void test4() {
	assertEquals(false, NestParen.nestParen("((())"));
    }

    @Test
    public void test5() {
	assertEquals(false, NestParen.nestParen("((()()"));
    }

    @Test
    public void test6() {
	assertEquals(true, NestParen.nestParen("()"));
    }

    @Test
    public void test7() {
	assertEquals(true, NestParen.nestParen(""));
    }

    @Test
    public void test8() {
	assertEquals(false, NestParen.nestParen("(yy)"));
    }
    
    @Test
    public void test9() {
	assertEquals(true, NestParen.nestParen("(())"));
    }
    
    @Test
    public void test10() {
	assertEquals(false, NestParen.nestParen("(((y))"));
    }
    
    @Test
    public void test11() {
	assertEquals(false, NestParen.nestParen("((y)))"));
    }
    
    @Test
    public void test12() {
	assertEquals(true, NestParen.nestParen("((()))"));
    }
    
    @Test
    public void test13() {
	assertEquals(false, NestParen.nestParen("(())))"));
    }
    
    @Test
    public void test14() {
	assertEquals(false, NestParen.nestParen("((yy())))"));
    }
    
    @Test
    public void test15() {
	assertEquals(true, NestParen.nestParen("(((())))"));
    }
}
