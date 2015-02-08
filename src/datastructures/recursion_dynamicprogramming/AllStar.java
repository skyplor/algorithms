package datastructures.recursion_dynamicprogramming;

public class AllStar {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String allStar(String str) {
	if (str.length() <= 1)
	    return str;
	String first = str.substring(0, 1);
	String star = "*";
	return first + star + allStar(str.substring(1));
    }

}
