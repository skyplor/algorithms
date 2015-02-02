package datastructures.recursion_dynamicprogramming;

/**
 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 * @author Sky
 * 
 */
public class Count8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("8 : " + count8(8));
	System.out.println("818 : " + count8(818));
	System.out.println("8188 : " + count8(8188));
	System.out.println("123 : " + count8(123));
	System.out.println("88888 : " + count8(88888));
    }

    public static int count8(int n) {
	if (n < 10) {
	    if (n == 8)
		return 1;
	    else
		return 0;
	} else {
	    if ((n % 100) == 88)
		return 2 + count8(n / 10);
	    else if ((n % 10) == 8)
		return 1 + count8(n / 10);
	    else
		return count8(n / 10);
	}
    }

}
