package datastructures.recursion_dynamicprogramming;

public class StrCount {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int strCount(String str, String sub) {
	if (str.length() < sub.length())
	    return 0;
	int count = 0;
	if (str.substring(0, sub.length()).equals(sub)) {
	    count = 1;
	    return count + strCount(str.substring(sub.length()), sub);
	} else
	    return strCount(str.substring(1), sub);
    }

}
