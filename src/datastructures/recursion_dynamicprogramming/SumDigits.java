package datastructures.recursion_dynamicprogramming;

/**
 * Given a non-negative int n, return the sum of its digits recursively (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
 * digit (126 / 10 is 12).
 * 
 * @author Sky
 * 
 */
public class SumDigits {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (int i = 126; i < 129; i++) {
	    System.out.println(i + " = " + sumDigits(i));
	}
    }

    public static int sumDigits(int n) {
	if (n < 10)
	    return n;
	else {
	    return (n % 10) + sumDigits(n / 10);
	}
    }
}
