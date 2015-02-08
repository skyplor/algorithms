package datastructures.recursion_dynamicprogramming;

public class Array220 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean array220(int[] nums, int index) {
	if (index >= nums.length - 1)
	    return false;
	boolean temp = false;
	if (index <= nums.length - 2) {
	    // Because division by 10 will give only int value so not accurate
	    temp = (nums[index] * 10 == (nums[index + 1]));
	}
	return temp || array220(nums, index + 1);
    }
}
