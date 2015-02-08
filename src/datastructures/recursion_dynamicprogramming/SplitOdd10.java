package datastructures.recursion_dynamicprogramming;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, 
 * so that the sum of one group is a multiple of 10, and the sum of the other group is odd. 
 * Every int must be in one group or the other. 
 * Write a recursive helper method that takes whatever arguments you like, 
 * and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
 * 
 * splitOdd10({5, 5, 5}) → true
 * splitOdd10({5, 5, 6}) → false
 * splitOdd10({5, 5, 6, 1}) → true
 * 
 * @author Sky
 * 
 */
public class SplitOdd10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean splitOdd10(int[] nums) {
	return splitOdd10(0, nums, 0, 0);
    }

    private static boolean splitOdd10(int start, int[] nums, int g1sum, int g2sum) {
	if (start > nums.length - 1)
	    return (g1sum % 10 == 0) && (g2sum % 2 == 1);

	return splitOdd10(start + 1, nums, g1sum + nums[start], g2sum) || splitOdd10(start + 1, nums, g1sum, g2sum + nums[start]);
    }
}
