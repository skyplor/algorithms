package datastructures.recursion_dynamicprogramming;

public class NoX {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String noX(String str) {
	if (str.length() == 0)
	    return str;
	if (str.charAt(0) == 'x')
	    return noX(str.substring(1));
	else
	    return str.charAt(0) + noX(str.substring(1));
    }

}
