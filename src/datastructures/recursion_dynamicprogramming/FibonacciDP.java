package datastructures.recursion_dynamicprogramming;

public class FibonacciDP {

    public static long fib(int n) {
	if (n <= 0)
	    return 0L;
	long n1 = 1;
	long n2 = 1;
	long current = 0;
	if (n == 1 || n == 2)
	    current = 1;
	for (int i = 3; i <= n; i++) {
	    current = n1 + n2;
	    n2 = n1;
	    n1 = current;
	}
	return current;
    }
}
