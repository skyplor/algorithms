package datastructures.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Determine if two strings are isomorphic.<br>
 * Two words are called isomorphic if the letters in one word can be remapped to
 * get the second word. Remapping a letter means replacing all occurrences of it
 * with another letter. The ordering of the letters remains unchanged. No two
 * letters may map to the same letter, but a letter may map to itself. <br>
 * E.g.<br>
 * The words "abca" and "zbxz" are isomorphic because we can map 'a' to 'z', 'b'
 * to 'b' and 'c' to 'x'.
 * 
 * @author Sky
 * 
 */
public class CheckIsIsomorphic {

    public static void main(String[] args) {
	String s1 = "hello";
	String s2 = "abcco";
	System.out.println("\"" + s1 + "\" and \"" + s2 + "\" is isomorphic? " + isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic(String s1, String s2) {
	if (s1 == null || s2 == null)
	    return false;
	if (s1.length() != s2.length())
	    return false;

	return map(s1, s2) && map(s2, s1);
    }

    public static boolean map(String sSrc, String sMap) {
	int size = sSrc.length();
	Map<Character, Character> replaceMap = new HashMap<Character, Character>();
	for (int i = 0; i < size; i++) {
	    if (!replaceMap.containsKey(sSrc.charAt(i)))
		replaceMap.put(sSrc.charAt(i), sMap.charAt(i));
	    else if (sMap.charAt(i) != replaceMap.get(sSrc.charAt(i)))
		return false;
	}

	return true;
    }
}
