package datastructures.recursion_dynamicprogramming;

public class CountX {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int countX(String str) {
	if (str.length() == 0)
	    return 0;
	else {
	    if (str.charAt(0) == 'x')
		return 1 + countX(str.substring(1));
	    else
		return countX(str.substring(1));
	}
    }
}
