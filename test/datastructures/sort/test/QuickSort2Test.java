package datastructures.sort.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import datastructures.sort.QuickSort2;

public class QuickSort2Test {
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
    public void testNull() {
	QuickSort2 sorter = new QuickSort2();
	sorter.sort(null);
    }

    @Test
    public void testEmpty() {
	QuickSort2 sorter = new QuickSort2();
	sorter.sort(new int[0]);
    }

    @Test
    public void testSimpleElement() {
	QuickSort2 sorter = new QuickSort2();
	int[] test = new int[1];
	test[0] = 5;
	sorter.sort(test);
    }

    @Test
    public void testSpecial() {
	QuickSort2 sorter = new QuickSort2();
	int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 };
	sorter.sort(test);
	if (!validate(test)) {
	    fail("Should not happen");
	}
	printResult(test);
    }

    @Test
    public void testQuickSort2() {
	for (Integer i : numbers) {
	    System.out.println(i + " ");
	}
	long startTime = System.currentTimeMillis();

	QuickSort2 sorter = new QuickSort2();
	sorter.sort(numbers);

	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("Quicksort " + elapsedTime);

	if (!validate(numbers)) {
	    fail("Should not happen");
	}
	assertTrue(true);
    }

    @Test
    public void testStandardSort() {
	long startTime = System.currentTimeMillis();
	Arrays.sort(numbers);
	long stopTime = System.currentTimeMillis();
	long elapsedTime = stopTime - startTime;
	System.out.println("Standard Java sort " + elapsedTime);
	if (!validate(numbers)) {
	    fail("Should not happen");
	}
	assertTrue(true);
    }

    private boolean validate(int[] numbers) {
	for (int i = 0; i < numbers.length - 1; i++) {
	    if (numbers[i] > numbers[i + 1]) {
		return false;
	    }
	}
	return true;
    }

    private void printResult(int[] numbers) {
	for (int i = 0; i < numbers.length; i++) {
	    System.out.print(numbers[i]);
	}
	System.out.println();
    }
}
