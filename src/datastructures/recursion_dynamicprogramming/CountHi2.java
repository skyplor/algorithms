package datastructures.recursion_dynamicprogramming;

public class CountHi2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int countHi2(String str) {
	if (str.length() <= 3) {
	    if (str.length() < 2)
		return 0;
	    else if (str.length() == 2) {
		if (str.equals("hi"))
		    return 1;
		else
		    return 0;
	    } else {
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		if (first == 'x')
		    return 0;
		if (first == 'h' && second == 'i')
		    return 1;
		else if (second == 'h' && third == 'i')
		    return 1;
		else
		    return 0;
	    }
	}
	char first = str.charAt(0);
	char second = str.charAt(1);
	int count = 0;
	if (first == 'x' && second != 'x')
	    return countHi2(str.substring(2));
	// if (first == 'x' && second == 'x')
	if (first == 'h' && second == 'i')
	    count = 1;
	return count + countHi2(str.substring(1));
    }
}
