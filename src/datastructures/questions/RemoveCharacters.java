package datastructures.questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Write a function that deletes characters from a string.
 * 
 * Any character existing in remove must be deleted from str.
 * Input: str = "Battle of the Vowels: Hawaii vs. Grozny", remove = "aeiou"
 * Output: "Bttl f th Vwls: Hw vs. Grzny"
 * 
 * @author Sky
 *
 */
public class RemoveCharacters {
    Set<Integer> hash = new LinkedHashSet<Integer>();

    /*
     * 1st pass, we put into hashset as it allows for constant time lookup (because of it storing the hashcodes of each key internally)
     * 
     * 2nd pass, we look up each character in str and check if contains in the set.
     * Several implementations for traversing, deleting and returning the String.
     * 
     * Constraint is that String is immutable
     * 1. We can work with array, each deletion we have to shift the rest of the characters back 1 index. Time complexity would be an issue
     * 2. We can use a StringBuilder.
     * 3. We can have 2 pointers i.e. read write pointer and overwrite the write pointer when required
     */

    // 2nd option - the toString method do an arraycopy at the end, incurring another N space
    // Possibility of an array copy operation due to array overflow
    // Since StringBuilder will initiate with a capacity of 16, and we will definitely reach more than 16 characters here,
    // Array copying will definitely be done
    public String removeChars2(String str, String remove) {
	Set<Character> set = new HashSet<Character>();
	for (int i = 0; i < remove.length(); i++)
	    set.add(remove.charAt(i));
	StringBuilder sb = new StringBuilder();
	char[] strChars = str.toCharArray();
	for (int i = 0; i < strChars.length; i++)
	    if (!set.contains(strChars[i])) {
		sb.append(strChars[i]);
	    }
	return sb.toString();
    }

    // 2nd option - alternate way so we eliminate the need to reallocate and thus creating a new array and doing array copy
    // BUT each time deleteCharAt is called, it does an arraycopy. Bad idea to use this
    public String removeChars2Alt(String str, String remove) {
	Set<Character> set = new HashSet<Character>();
	for (int i = 0; i < remove.length(); i++)
	    set.add(remove.charAt(i));
	StringBuilder sb = new StringBuilder(str);
	int p = 0;
	for (int i = 0; i < str.length(); i++)
	    if (set.contains(str.charAt(i))) {
		sb.deleteCharAt(i - p);
		p++;
	    }
	return sb.toString();
    }

    // 2nd option - alternate way by initialising with a specific length.
    // So we eliminate the need to reallocate and thus creating a new array and doing array copy
    public String removeChars2Alt2(String str, String remove) {
	Set<Character> set = new HashSet<Character>();
	for (int i = 0; i < remove.length(); i++)
	    set.add(remove.charAt(i));
	StringBuilder sb = new StringBuilder(str.length());
	char[] strChars = str.toCharArray();
	for (int i = 0; i < strChars.length; i++)
	    if (!set.contains(strChars[i])) {
		sb.append(strChars[i]);
	    }
	return sb.toString();
    }

    // 3rd option - All 3 methods does an array copy at the end so shouldn't be a factor for consideration
    // This idea is the best as we completely eliminate the possibility of array resizing by having the pointers
    public String removeChars3(String str, String remove) {
	Set<Character> set = new HashSet<Character>();
	for (int i = 0; i < remove.length(); i++)
	    set.add(remove.charAt(i));
	int read = 0, write = 0;
	char[] strChars = str.toCharArray();
	while (read < strChars.length) {
	    if (set.contains(strChars[read]))
		read++;
	    else {
		strChars[write++] = strChars[read++];
	    }
	}
	return new String(strChars, 0, write);
    }

}
