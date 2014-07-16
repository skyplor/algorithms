package datastructures.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Power set P(S) of a set S is the set of all subsets of S. For example S = {a,
 * b, c} then P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.
 * Given an array of integers, generate the Power set of these integers.
 * 
 * @author Sky
 * 
 */
public class CreatePowerSet {

    public static void main(String[] args) {
	int[] nums = new int[] { 1, 2, 3, 4 };
	List<List<Integer>> lists = ComputePowerSet(nums);
	if (lists != null)
	    for (List<Integer> list : lists) {
		System.out.println(list.toString());
	    }
    }

    public static List<List<Integer>> ComputePowerSet(int[] nums) {
	// Full implementation here
	if (nums == null)
	    return null;
	return ComputePowerSet(nums, nums.length);
    }

    private static List<List<Integer>> ComputePowerSet(int[] nums, int n) {
	if (n == 0) {
	    List<List<Integer>> lists = new ArrayList<List<Integer>>();
	    lists.add(new ArrayList<Integer>());
	    return lists;
	}

	List<List<Integer>> allLists = ComputePowerSet(nums, n - 1);
	List<List<Integer>> moreLists = new ArrayList<List<Integer>>();
	for (List<Integer> l : allLists) {
	    List<Integer> l2 = new ArrayList<Integer>();
	    l2.addAll(l); // clone
	    l2.add(nums[n - 1]);
	    moreLists.add(l2);
	}
	System.out.println("More Lists: " + moreLists.toString());
	allLists.addAll(moreLists);
	System.out.println("All Lists: " + allLists.toString());
	return allLists;
    }
}
