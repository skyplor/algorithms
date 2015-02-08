package datastructures.recursion_dynamicprogramming;

/**
 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
 * The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent
 * value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
 * Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0
 * representing the start of the sequence.
 * 
 * @author Sky
 * 
 */
public class Fibonacci {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (int i = 0; i < 20; i++)
	    System.out.println(fibonacci(i));
    }

    /*
     * n = 0, return 0
     * n = 1, return 1
     * n = 2, return 0 + 1 = 1
     * n = 3, return 1 + 1 = 2
     * n = 4, return 1 + 2 = 3
     * n = 5, return 2 + 3 = 5
     */
    public static int fibonacci(int n) {
	if (n <= 0)
	    return 0;
	if (n == 1)
	    return 1;
	else {
	    int result = fibonacci(n - 1) + fibonacci(n - 2);
	    return result;
	}
    }

}
