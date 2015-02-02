package datastructures.recursion_dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function (in pseudo-code) called dumpList that takes as its parameters
 * a string and a reference to an arbitrarily complex nested list and prints the
 * value of each list element on a separate line. The value of each line should be
 * preceded by the string and numbers indicating the depth and index of the element
 * in the list. Assume that the list contains only strings and other nested lists.
 * 
 * @author Sky
 * 
 */
public class DumpList {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<Object> l = new ArrayList<Object>();
	List<Object> l2 = new ArrayList<Object>();
	List<Object> l3 = new ArrayList<Object>();
	l.add("a string");
	l2.add('a');
	l2.add('b');
	l2.add('c');
	l.add(l2);
	l.add("spam");
	l3.add("eggs");
	l.add(l3);
	printList("foo", l, 0);
    }

    public static void printList(String s, List<?> l, int level) {
	System.out.println("In PrintList, level: " + level);
	for (int i = 0; i < l.size(); i++) {
	    if (!(l.get(i) instanceof List<?>)) {
		    System.out.println(s + "." + level + ": " + l.get(i));
		    return;
		//} else {
		    //System.out.println(s + "." + level + "." + i + ": " + l.get(i));
		    //return;
		//}
	    } else {
		List<Object> temp = new ArrayList<Object>();
		temp.add(l.get(i));
		printList(s, temp, level++);
	    }
	}

    }

}
