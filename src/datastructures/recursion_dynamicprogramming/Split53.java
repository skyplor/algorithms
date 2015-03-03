package datastructures.recursion_dynamicprogramming;

/**
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of the two groups is the same, with these constraints:
 * all the values that are multiple of 5 must be in one group,
 * and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
 * 
 * split53({1,1}) → true
 * split53({1, 1, 1}) → false
 * split53({2, 4, 2}) → true
 * 
 * @author Sky
 * 
 */
@SuppressWarnings("unused")
public class Split53 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean split53(int[] nums) {
	return split(0, nums, 0, 0);
    }

    private static boolean split53(int start, int[] nums, int g1sum, int g2sum) {
	if (start > nums.length - 1)
	    return g1sum == g2sum;
	if (nums[start] % 3 == 0)
	    return split53(start + 1, nums, g1sum + nums[start], g2sum);
	if (nums[start] % 5 == 0)
	    return split53(start + 1, nums, g1sum, g2sum + nums[start]);
	return split53(start + 1, nums, g1sum + nums[start], g2sum) || split53(start + 1, nums, g1sum, g2sum + nums[start]);
    }

    private static boolean split(int index, int[] nums, int first, int second) {
	if (index > nums.length - 1)
	    return first == second;
	if (nums[index] % 5 == 0)
	    return split(index + 1, nums, first + nums[index], second);
	else if (nums[index] % 3 == 0)
	    return split(index + 1, nums, first, second + nums[index]);
	else {
	    return split(index + 1, nums, first + nums[index], second) || split(index + 1, nums, first, second + nums[index]);
	}
    }

}
