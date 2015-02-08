package datastructures.recursion_dynamicprogramming;

public class Array11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int array11(int[] nums, int index) {
	if (index == nums.length)
	    return 0;
	int t = 0;
	if (nums[index] == 11) {
	    t = 1;
	}
	return t + array11(nums, index + 1);
    }

}
