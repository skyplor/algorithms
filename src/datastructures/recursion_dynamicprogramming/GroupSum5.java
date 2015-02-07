package datastructures.recursion_dynamicprogramming;

public class GroupSum5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(groupSum5(0, new int[] { 3, 5, 1 }, 9));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
	if (start > nums.length - 1)
	    return target == 0;
	// Constraint 1: all multiples of 5 must be included
	if ((nums[start] % 5) == 0) {
	    // Constraint 2: if value after a multiple of 5 is 1, not chosen
	    if ((start < nums.length - 1) && nums[start + 1] == 1) {
		return groupSum5(start + 2, nums, target - nums[start]) || groupSum5(start + 2, nums, target);
	    } else
		return groupSum5(start + 1, nums, target - nums[start]);
	}
	return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
    }
}
