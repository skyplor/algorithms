package datastructures.recursion_dynamicprogramming;

public class StrCopies {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean strCopies(String str, String sub, int n) {
	if (n == 0)
	    return true;
	if (str.length() < (sub.length() + n - 1))
	    return false;
	if (str.substring(0, sub.length()).equals(sub)) {
	    return strCopies(str.substring(1), sub, n - 1);
	} else
	    return strCopies(str.substring(1), sub, n);

    }

}
