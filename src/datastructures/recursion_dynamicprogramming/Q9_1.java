package datastructures.recursion_dynamicprogramming;

/**
 * A child is running up a staircase with n steps, and can hop either 1 step, 2
 * steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 * 
 * @author Sky
 * 
 */
public class Q9_1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (int i = 0; i < 30; i++) {
	    long t1 = System.currentTimeMillis();
	    int[] map = new int[30 + 1];
	    for (int j = 0; j < map.length; j++) {
		map[j] = -1;
	    }
	    int c1 = countStepsDP(i, map);
	    long t2 = System.currentTimeMillis();
	    long d1 = t2 - t1;

	    long t3 = System.currentTimeMillis();
	    int c2 = countStepsRecursion(i);
	    long t4 = System.currentTimeMillis();
	    long d2 = t4 - t3;
	    System.out.println(i + ", " + c1 + ", " + c2 + ", DP: " + d1 + "s, recursion: " + d2 + "s");
	}

    }

    public static int countStepsRecursion(int n) {
	if (n < 0)
	    return 0;
	if (n == 0)
	    return 1;
	return countStepsRecursion(n - 1) + countStepsRecursion(n - 2) + countStepsRecursion(n - 3);
    }

    public static int countStepsDP(int n, int[] a) {
	if (n < 0)
	    return 0;
	if (n == 0)
	    return 1;
	if (a[n] > -1)
	    return a[n];
	a[n] = countStepsDP(n - 1, a) + countStepsDP(n - 2, a) + countStepsDP(n - 3, a);
	return a[n];
    }
}
