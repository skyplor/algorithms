package datastructures.recursion_dynamicprogramming;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint
 * that all 6's must be chosen. (No loops needed.)
 * 
 * groupSum6(0, {5, 6, 2}, 8) → true
 * groupSum6(0, {5, 6, 2}, 9) → false
 * groupSum6(0, {5, 6, 2}, 7) → false
 * 
 * @author Sky
 * 
 */
public class GroupSum6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public static boolean groupSum6(int start, int[] nums, int target) {
	if (start > nums.length - 1)
	    return target == 0;
	if (nums[start] == 6)
	    return groupSum6(start + 1, nums, target - 6);
	return (groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target));
    }
}
