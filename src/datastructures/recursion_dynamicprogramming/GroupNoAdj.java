package datastructures.recursion_dynamicprogramming;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target with this additional constraint:
 * If a value in the array is chosen to be in the group,
 * the value immediately following it in the array must not be chosen. (No loops needed.)
 * 
 * groupNoAdj(0, {2, 5, 10, 4}, 12) → true
 * groupNoAdj(0, {2, 5, 10, 4}, 14) → false
 * groupNoAdj(0, {2, 5, 10, 4}, 7) → false
 * 
 * @author Sky
 * 
 */
public class GroupNoAdj {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
	if (start > nums.length - 1)
	    return target == 0;
	if (groupNoAdj(start + 1, nums, target - nums[start]))
	    return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
	if (groupNoAdj(start + 1, nums, target))
	    return true;
	return false;
    }

    public static boolean groupNoAdj2(int start, int[] nums, int target) {
	return group(start, nums, target, 0);
    }

    private static boolean group(int start, int[] nums, int target, int sum) {
	if (start > nums.length - 1)
	    return sum == target;
	return group(start + 2, nums, target, sum + nums[start]) || group(start + 1, nums, target, sum);
    }
}
