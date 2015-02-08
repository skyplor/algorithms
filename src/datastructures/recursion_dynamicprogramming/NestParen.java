package datastructures.recursion_dynamicprogramming;

public class NestParen {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static boolean nestParen(String str) {
	if (str.length() == 0)
	    return true;
	if (str.length() == 1)
	    return false;
	if (str.length() == 2) {
	    if (str.equals("()"))
		return true;
	    else
		return false;
	}
	boolean addon = false;
	if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
	    addon = true;
	else
	    return false;
	return addon && nestParen(str.substring(1, str.length() - 1));
    }
}
