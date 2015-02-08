package datastructures.recursion_dynamicprogramming;

public class Array6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean array6(int[] nums, int index) {
	if (index == nums.length)
	    return false;
	return (nums[index] == 6) || array6(nums, index + 1);
    }
}
