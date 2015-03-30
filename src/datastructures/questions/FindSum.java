package datastructures.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a sorted array, write a program to decide if there are any two elements that sum up to a third.
 * 
 * @author Sky
 *
 */
public class FindSum {

    // Brute force method would be to add up all possible pairs of elements and store the result in a set.
    // Next, check if the hash contains the given number.
    public boolean checkSum(int[] a, int sum) {
	if (a.length > 1) {
	    Set<Integer> s = new HashSet<Integer>();
	    for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
		    int tempsum = a[i] + a[j];
		    s.add(tempsum);
		}
	    }
	    return s.contains(sum);
	}
	return false;
    }

    public boolean checkSum2(int[] a, int sum) {
	// O(N) solution
	for (int i = 0; i < a.length; i++) {
	    for (int j = a.length - 1; j > i; j--) {
		if (a[i] + a[j] == sum)
		    return true;
		else if (a[i] + a[j] < sum)
		    break;
	    }
	}
	return false;
    }
}
