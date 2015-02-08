package datastructures.recursion_dynamicprogramming;

public class Count11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int count11(String str) {
	if (str.length() <= 1)
	    return 0;
	String first2 = str.substring(0, 2);
	int count = 0;
	if (first2.equals("11")) {
	    count = 1;
	    return count + count11(str.substring(2));
	} else
	    return count11(str.substring(1));
    }

}
