package datastructures.recursion_dynamicprogramming;

/**
 * Write a program to determine whether an input string x is a substring of another input string y.
 * 
 * For example "bat" is a substring of "abate", but not of "beat"
 * 
 * @author Sky
 *
 */
public class CheckSubString {

    public CheckSubString() {

    }

    public boolean isSubstring(String main, String sub) {
	return isSubstring(main, sub, sub, true);
    }

    private boolean isSubstring(String main, String sub, String tempSub, boolean matched) {
	if (main.length() < tempSub.length())
	    return false;
	if (tempSub.isEmpty()) return true;
	if (tempSub.length() == 1 && main.charAt(0) == tempSub.charAt(0))
	    return true;
	if (main.charAt(0) == tempSub.charAt(0)) {
	    // reduce both by 1
	    return isSubstring(main.substring(1), sub, tempSub.substring(1), true);
	} else {
	    if (matched)
		return isSubstring(main, sub, sub, false);
	    // proceed to reduce main by 1 while sub don't get reduced.
	    return isSubstring(main.substring(1), sub, sub, false);
	}
    }
}
