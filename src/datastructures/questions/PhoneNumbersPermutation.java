package datastructures.questions;

import java.util.ArrayList;

/**
 * On common phones each digit can be mapped to three or four letters.
 * For instance 2 can be mapped to a, b, or c.
 * Given a phone number represented as an array of integers, return all the possible
 * permutations of strings for that phone number.
 * For example [2, 3] would result in {“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”}.
 */
public class PhoneNumbersPermutation {
    // What about 0s and 1s?
    // Does it mapped to exactly as our current phone configuration?
    // that would mean:
    /*
     * 2-ABC
     * 3-DEF
     * 4-GHI
     * 5-JKL
     * 6-MNO
     * 7-PQRS
     * 8-TUV
     * 9-WXYZ
     */

    // Do we have a dictionary where by we pass in 2 and get back the list of characters? Or I have to implement it?
    // Assuming I'm implementing this as well.

    public ArrayList<String>[] letters;

    @SuppressWarnings("unchecked")
    public void initPhoneLetters() {
	letters = (ArrayList<String>[]) new ArrayList[8];
	ArrayList<String> l = new ArrayList<String>();
	for (int i = 0; i < letters.length; i++) {
	    switch (i) {
	    case 0:
		l.add("A");
		l.add("B");
		l.add("C");
		break;
	    case 1:
		l.add("D");
		l.add("E");
		l.add("F");
		break;
	    case 2:
		l.add("G");
		l.add("H");
		l.add("I");
		break;
	    case 3:
		l.add("J");
		l.add("K");
		l.add("L");
		break;
	    case 4:
		l.add("M");
		l.add("N");
		l.add("O");
		break;
	    case 5:
		l.add("P");
		l.add("Q");
		l.add("R");
		l.add("S");
		break;
	    case 6:
		l.add("T");
		l.add("U");
		l.add("V");
		break;
	    case 7:
		l.add("W");
		l.add("X");
		l.add("Y");
		l.add("Z");
		break;

	    }
	    letters[i] = new ArrayList<String>(l);
	    // clear the arraylist to prevent letters from repeating
	    l.clear();
	}
    }

    public ArrayList<String> getLetters(int n) {
	if (n > 1 && n < 10) {
	    // need to reduce by 2 to access this array
	    return letters[n - 2];
	} else
	    return null;
    }
    
    public PhoneNumbersPermutation() {
	initPhoneLetters();
    }
}
