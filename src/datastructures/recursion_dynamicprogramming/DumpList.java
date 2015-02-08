package datastructures.recursion_dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function (in pseudo-code) called dumpList that takes as its parameters
 * a string and a reference to an arbitrarily complex nested list and prints the
 * value of each list element on a separate line.
 * 
 * The value of each line should be
 * preceded by the string and numbers indicating the depth and index of the element
 * in the list. Assume that the list contains only strings and other nested lists.
 * 
 * E.g. List = ['a string', ['a','b','c'], 'spam', ['eggs']]
 * Foo.0: a string
 * Foo.1.0: a
 * Foo.1.1 : b
 * Foo.1.2: c
 * Foo.2: spam
 * Foo.3.0: eggs
 * 
 * @author Sky
 * 
 */
public class DumpList {

    /**
     * @param args
     */
    public static void main(String[] args) {
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
	printList("Foo", l);
    }

    @SuppressWarnings("unchecked")
    public static void printList(String s, List<Object> l) {
	for (int i = 0; i < l.size(); i++) {
	    if (l.get(i) instanceof List) {
		printList(s + "." + i, (List<Object>) l.get(i));
	    } else {
		System.out.println(s + "." + i + ": " + l.get(i));
	    }
	}
    }
}
