package datastructures.recursion_dynamicprogramming;

public class CountHi {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int countHi(String str) {
	if (str.length() < 2)
	    return 0;
	int count = 0;
	if (str.substring(0, 2).equals("hi"))
	    count = 1;
	return count + countHi(str.substring(1));
    }
}
