package datastructures.recursion_dynamicprogramming;

public class EndX {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String endX(String str) {
	if (str.length() <= 1)
	    return str;
	String first = str.substring(0, 1);
	if (first.equals("x"))
	    return endX(str.substring(1)) + first;
	else
	    return first + endX(str.substring(1));
    }

}
