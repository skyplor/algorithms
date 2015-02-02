package datastructures.recursion_dynamicprogramming;

/**
 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
 * so powerN(3, 2) is 9 (3 squared).
 * 
 * @author Sky
 * 
 */
public class PowerN {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (int i = 1; i < 5; i++) {
	    for (int j = 1; j < 5; j++) {
		System.out.println(i + " to the power of " + j + " : " + powerN(i, j));
	    }
	}
    }

    public static int powerN(int base, int n) {
	if (n == 1)
	    return base;
	else {
	    return base * powerN(base, n - 1);
	}
    }

}
