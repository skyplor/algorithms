package datastructures.bit_manipulation;

import datastructures.util.AssortedMethods;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, land j. Write a method to insert M into N such that M starts at bit j and ends at bit i. You can assume that the bits j through i have enough space to fit all of M. That is, if M = 10011, you can assume that there are at least 5 bits between j and i. You would not, for example, have j = 3 and i = 2, because M could not fully fit
 * between bit 3 and bit 2.
 * <br>
 * E.g.<br>
 * Input: N = 10000000000, M = 10011, i = 2, j = 6<br>
 * Output: N = 10001001100
 * 
 * 
 * @author Sky
 * 
 */
public class Q5_1_UpdateBit
{

	public static void main(String[] args)
	{
		System.out.println("N: " + Integer.toBinaryString(103217));
		System.out.println("M: " + Integer.toBinaryString(13));
		System.out.println("Updated: " + Integer.toBinaryString(updateBits1(4, 12, 13, 103217)));

		int a = 103217;
		System.out.println(AssortedMethods.toFullBinaryString(a));
		int b = 13;
		System.out.println(AssortedMethods.toFullBinaryString(b));
		int c = updateBits2(a, b, 4, 12);
		System.out.println(AssortedMethods.toFullBinaryString(c));
	}

	public static int updateBits1(int i, int j, int M, int N)
	{
		int mask = 0;
		for (int tmp = i; tmp <= j; tmp++)
		{
			mask += 1 << tmp;
		}

		mask = ~mask;

		System.out.println("Mask: " + Integer.toBinaryString(mask));

		return (N & mask) | (M << i);
	}

	public static int updateBits2(int n, int m, int i, int j)
	{
		// Validation
		if (i >= 32 || j < i)
		{
			return 0;
		}

		/*
		 * Create a mask to clear bits i through j in n /* EXAMPLE: i = 2, j = 4. Result should be 11100011. (Using 8 bits for this example. This is obviously not actually 8 bits.)
		 */
		int allOnes = ~0; // allOnes = 11111111

		int left = allOnes << (j + 1); // 1s through position j, then 0s. left = 11100000
		int right = ((1 << i) - 1); // 1�s after position i. right = 00000011
		int mask = left | right; // All 1s, except for 0s between i and j. mask = 11100011

		/* Clear i through j, then put m in there */
		int n_cleared = n & mask; // Clear bits j through i.
		int m_shifted = m << i; // Move m into correct position.

		/* OR them, and we're done! */
		return n_cleared | m_shifted;
	}
}
