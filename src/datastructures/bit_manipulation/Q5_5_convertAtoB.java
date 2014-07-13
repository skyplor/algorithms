package datastructures.bit_manipulation;

import datastructures.util.AssortedMethods;

/**
 * Write a function to determine the number of bits required to convert integer
 * A to integer B. <br>
 * E.g.<br>
 * Input: 31, 14<br>
 * Output: 2
 * 
 * @author Sky
 * 
 */
public class Q5_5_convertAtoB {
    public static void main(String[] args) {
	int a = 31;
	int b = 14;

	System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
	System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
	System.out.println("Number of bits to change: " + numberOfBits(a, b));
    }

    public static int numberOfBits(int a, int b) {
	int count = 0;
	for (int i = 0; i < 32; i++) {
	    if (!getBit(a, b, i)) {
		count++;
	    }
	}
	return count;
    }

    public static boolean getBit(int a, int b, int i) {
	return ((a & (1 << i)) == ((b & (1 << i))));
    }

    public static int bitSwapRequired(int a, int b) {
	int count = 0;
	for (int c = a ^ b; c != 0; c = c >> 1) {
	    count += c & 1;
	}
	return count;
    }

    public static int bitSwapRequired2(int a, int b) {
	int count = 0;
	for (int c = a ^ b; c != 0; c = c & (c - 1)) {
	    count++;
	}
	return count;
    }
}
