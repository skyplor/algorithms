package datastructures.recursion_dynamicprogramming;

public class StringClean {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String stringClean(String str) {
	if (str.length() <= 1)
	    return str;
	char first = str.charAt(0);
	char second = str.charAt(1);

	if (first == second)
	    return stringClean(str.substring(1));
	return first + stringClean(str.substring(1));
    }
}
