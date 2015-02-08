package datastructures.recursion_dynamicprogramming;

public class PairStar {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String pairStar(String str) {
	if (str.length() <= 1)
	    return str;
	// get first character
	String first = str.substring(0, 1);
	String second = str.substring(1, 2);
	String addon = first;
	if (first.equals(second))
	    addon = first + "*";
	return addon + pairStar(str.substring(1));
    }

}
