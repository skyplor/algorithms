package datastructures.util;

import java.util.LinkedHashSet;

/**
 * Write a function to remove the duplicated characters from a string, and
 * maintain the order of the characters. e.g. “abracadabra” ? “abrcd”
 * 
 * @author Sky
 * 
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
	String s = "abracadabra";
	System.out.println("Remove duplicates of "+ s + ": " + removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
	// Full implementation here
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	char[] c = s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
	    set.add(c[i]);
	}
	StringBuilder sb = new StringBuilder();
	for (char cha : set) {
	    sb.append(cha);
	}
	return sb.toString();
    }
}
