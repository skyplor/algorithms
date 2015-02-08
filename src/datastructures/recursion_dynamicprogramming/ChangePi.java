package datastructures.recursion_dynamicprogramming;

public class ChangePi {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String changePi(String str) {
	if (str.length() == 0)
	    return "";
	if (str.length() == 1)
	    return str;
	String t = "";
	if (str.substring(0, 2).equals("pi")) {
	    t = "3.14";
	    return t + changePi(str.substring(2));
	} else
	    t = str.substring(0, 1);
	return t + changePi(str.substring(1));
    }
}
