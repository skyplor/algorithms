package datastructures.recursion_dynamicprogramming;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
 * (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
 * divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 * @author Sky
 * 
 */
public class Count7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("717 : " + count7(717));
	System.out.println("7 : " + count7(7));
	System.out.println("123 : " + count7(123));
	System.out.println("7123 : " + count7(7123));
	System.out.println("71237 : " + count7(71237));
	System.out.println("77776425 : " + count7(77776425));
	System.out.println("9999999 : " + count7(9999999));
	System.out.println("0 : " + count7(0));
    }

    public static int count7(int n) {
	if (n < 10) {
	    if (n == 7)
		return 1;
	    else
		return 0;
	} else {
	    if ((n % 10) == 7)
		return 1 + count7(n / 10);
	    else
		return count7(n / 10);
	}
    }

}
