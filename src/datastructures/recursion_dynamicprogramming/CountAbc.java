package datastructures.recursion_dynamicprogramming;

public class CountAbc {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int countAbc(String str) {
	if (str.length() <= 2)
	    return 0;
	char first = str.charAt(0);
	char second = str.charAt(1);
	char third = str.charAt(2);
	int addon = 0;
	if (first == 'a' && second == 'b' && (third == 'c' || third == 'a'))
	    addon = 1;
	return addon + countAbc(str.substring(1));
    }
}
