package datastructures.recursion_dynamicprogramming;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, 
 * so that the sums of the two groups are the same. Every int must be in one group or the other. 
 * Write a recursive helper method that takes whatever arguments you like, 
 * and make the initial call to your recursive helper from splitArray(). (No loops needed.)
 * 
 * splitArray({2, 2}) → true
 * splitArray({2, 3}) → false
 * splitArray({5, 2, 3}) → true
 * 
 * @author Sky
 * 
 */
public class SplitArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean splitArray(int[] nums) {
	return splitArray(nums, 0, 0, 0);
    }

    private static boolean splitArray(int[] original, int start, int g1Total, int g2Total) {
	if (start > original.length - 1)
	    return g1Total == g2Total;

	return splitArray(original, start + 1, g1Total + original[start], g2Total) || splitArray(original, start + 1, g1Total, g2Total + original[start]);
    }

}
