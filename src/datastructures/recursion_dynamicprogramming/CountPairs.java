package datastructures.recursion_dynamicprogramming;

public class CountPairs {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int countPairs(String str) {
	if (str.length() <= 2)
	    return 0;
	char first = str.charAt(0);
	char third = str.charAt(2);
	int addon = 0;
	if (first == third)
	    addon = 1;
	return addon + countPairs(str.substring(1));
    }

}
