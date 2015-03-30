package datastructures.questions.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import datastructures.questions.FindSum;

public class FindSumTest {
    int[] input;
    FindSum s;

    @Before
    public void setUp() throws Exception {
	input  = new int[10];
	for (int i = 0; i < input.length; i++) {
	    input[i] = i;
	}
	s = new FindSum();
    }
    
    @Test
    public void testSum() {
	assertEquals(true,s.checkSum2(input, 12));
    }
    
    @Test
    public void testSum2() {
	assertEquals(false,s.checkSum2(input, 20));
    }

}
