package datastructures.recursion_dynamicprogramming;

/**
 * Given n of 1 or more, return the factorial of n,
 * which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
 * 
 * @author Sky
 * 
 */
public class Factorial {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
	    System.out.println(i + " : " + factorial(i));
	}
    }

    public static int factorial(int n) {
	if (n == 0)
	    return 1;
	if (n == 1)
	    return 1;
	else
	    return n * factorial(n - 1);
    }

}
