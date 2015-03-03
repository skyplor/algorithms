package datastructures.sort.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import datastructures.sort.MergeSort2;


public class MergeSort2Test {
    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;

    @Before
    public void setUp() throws Exception {
	numbers = new int[SIZE];
	Random generator = new Random();
	for (int i = 0; i < numbers.length; i++) {
	    numbers[i] = generator.nextInt(MAX);
	}
    }

    @Test
    public void testMergeSort2() {
	long startTime = System.currentTimeMillis();

	MergeSort2 sorter = new MergeSort2();
	sorter.sort(numbers);

	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("MergeSort2 " + elapsedTime);

	for (int i = 0; i < numbers.length - 1; i++) {
	    if (numbers[i] > numbers[i + 1]) {
		fail("Should not happen");
	    }
	}
	assertTrue(true);

    }

    @Test
    public void itWorksRepeatably() {
	for (int i = 0; i < 200; i++) {
	    numbers = new int[SIZE];
	    Random generator = new Random();
	    for (int a = 0; a < numbers.length; a++) {
		numbers[a] = generator.nextInt(MAX);
	    }
	    MergeSort2 sorter = new MergeSort2();
	    sorter.sort(numbers);
	    for (int j = 0; j < numbers.length - 1; j++) {
		if (numbers[j] > numbers[j + 1]) {
		    fail("Should not happen");
		}
	    }
	    assertTrue(true);
	}
    }

    @Test
    public void testStandardSort() {
	long startTime = System.currentTimeMillis();
	Arrays.sort(numbers);
	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("Standard Java sort " + elapsedTime);

	for (int i = 0; i < numbers.length - 1; i++) {
	    if (numbers[i] > numbers[i + 1]) {
		fail("Should not happen");
	    }
	}
	assertTrue(true);
    }

    @Test
    public void testLeftSorted() {
	numbers = new int[] { 0, 1, 2, 5, 8, 6 };
	MergeSort2 sorter = new MergeSort2();
	sorter.sort(numbers);
	for (int i = 0; i < numbers.length - 1; i++) {
	    if (numbers[i] > numbers[i + 1]) {
		fail("Should not happen");
	    }
	}
	assertTrue(true);
    }
}
