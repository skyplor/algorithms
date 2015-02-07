package datastructures.recursion_dynamicprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGroupNoAdj {

    int[] nums = {2, 5, 10, 4};
    int[] nums2 = {2, 5, 10, 4,2};
    int[] nums3 = {10, 2, 2, 3, 3};
    int[] nums4 = {};
    int[] nums5 = {1};
    int[] nums6 = {9};
    int[] nums7 = {5, 10, 4, 1};
    @Test
    public void testGroupNoAdj() {
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums, 12));
	assertEquals(false,GroupNoAdj.groupNoAdj(0, nums, 14));
	assertEquals(false,GroupNoAdj.groupNoAdj(0, nums, 7));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums2, 7));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums, 9));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums3, 15));
	assertEquals(false,GroupNoAdj.groupNoAdj(0, nums3, 7));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums4, 0));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums5, 1));
	assertEquals(false,GroupNoAdj.groupNoAdj(0, nums6, 1));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums6, 0));
	assertEquals(true,GroupNoAdj.groupNoAdj(0, nums7, 11));
    }

}
