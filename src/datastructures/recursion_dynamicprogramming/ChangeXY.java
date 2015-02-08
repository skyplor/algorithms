package datastructures.recursion_dynamicprogramming;

public class ChangeXY {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String changeXY(String str) {
	if (str.length() == 0)
	    return "";
	String t = "";
	if (str.charAt(0) == 'x')
	    t = "y";
	else
	    t = str.substring(0, 1);
	return t + changeXY(str.substring(1));
    }
}
