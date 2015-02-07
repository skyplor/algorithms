package datastructures.recursion_dynamicprogramming;

import java.util.HashSet;
import java.util.Set;

public class Subsets {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Set<Integer> s = new HashSet<Integer>();
	s.add(1);
	s.add(3);
	s.add(4);
	Set<Set<Integer>> result = subsets(s);
	for(Set<Integer> temp : result) {
	    System.out.println(temp);
	}
    }
    
    public static Set<Set<Integer>> subsets(Set<Integer> s) {
	Set<Set<Integer>> tempresults = new HashSet<Set<Integer>>();
	Set<Set<Integer>> results = new HashSet<Set<Integer>>();
	if(s.isEmpty()) {
	    results.add(new HashSet<Integer>(0));
	    return results;
	}
	int first = s.iterator().next();
	s.remove(first);
	tempresults = subsets(s);
	results.addAll(tempresults);
	for(Set<Integer> temp : tempresults) {
	    temp.add(first);
	    results.add(temp);
	}
	return results;
    }

}
