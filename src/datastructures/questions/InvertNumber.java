package datastructures.questions;

import java.util.Scanner;

/**
 * You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be
 * set, and set bits must be unset).
 * 
 * Input Format:
 * The first line of the input contains the list size T, which is followed by T lines, each line having an integer from the list.
 * 
 * Output Format:
 * Output one line per element from the list with the requested result.
 * 
 * Sample Input:
 * 3
 * 2147483647
 * 1
 * 0
 * 
 * Sample Output:
 * 2147483648
 * 4294967294
 * 4294967295
 * 
 * @author Sky
 *
 */
public class InvertNumber {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	int size = input.nextInt();
	for (int i = 0; i < size; i++) {
	    long toFlip = input.nextLong();
	    System.out.println(flip(toFlip));
	    System.out.println(flip2(toFlip));
	    System.out.println(flip3(toFlip));
	}
	input.close();
    }

    private static Long flip(Long a) {

	// 0x to indicate that following that is hexadecimal
	// 0xffffffffL = 0000 0000 0000 0000 0000 0000 0000 0000 1111 1111 1111 1111 1111 1111 1111 1111
	return ~a & 0xffffffffL;
    }

    private static Long flip2(Long a) {
	/*
	 * 1L: 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0001
	 * << 32: 0000 0000 0000 0000 0000 0000 0000 0001 0000 0000 0000 0000 0000 0000 0000 0000
	 * -1: 0000 0000 0000 0000 0000 0000 0000 0000 1111 1111 1111 1111 1111 1111 1111 1111
	 */
	long mask = (1L << 32) - 1;

	// Exclusive OR (^):
	// If the mask bit is true, the source bit will be inversed. 
	// If the mask bit is false, the source bit will remain.
	// In this case, we will bring over the first 32 bits and inverse the last 32 bits.
	return a ^ mask;
    }
    
    private static Long flip3(Long a) {
	/*
	 * 0xffffffffL: 0000 0000 0000 0000 0000 0000 0000 0000 1111 1111 1111 1111 1111 1111 1111 1111
	 */
	long mask = 0xffffffffL;

	// Exclusive OR (^):
	// If the mask bit is true, the source bit will be inversed. 
	// If the mask bit is false, the source bit will remain.
	// In this case, we will bring over the first 32 bits and inverse the last 32 bits.
	return a ^ mask;
    }
}
