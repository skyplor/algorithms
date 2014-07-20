package datastructures.mathematics_probability;

/**
 * Write methods to implement the multiply, subtract, and divide operations for
 * integers. Use only the add operator
 * 
 * @author Sky
 * 
 */
public class Q7_4_MathsFunction {

    public static void main(String[] args) {
	Q7_4_MathsFunction math = new Q7_4_MathsFunction();
	System.out.println("Divide: " + math.divide(10, -2));
	System.out.println("Mutiply: " + math.multiply(10, -2));
	System.out.println("Subtract: " + math.subtract(10, 2));
    }

    public int multiply(int a, int b) {
	int result = 0;
	for (int i = 0; i < absolute(b); i++) {
	    result += absolute(a);
	}
	if (a < 0 && b < 0 || a > 0 && b > 0)
	    return result;
	else
	    return negate(result);
    }

    private int absolute(int a) {
	if (a < 0)
	    return negate(a);
	else
	    return a;
    }

    public int subtract(int a, int b) {
	int result = 0;
	result = a + negate(b);
	return result;
    }

    private int negate(int a) {
	int neg = 0;
	// if "a" is negative, we add it slowly back to 0. So we need a positive
	// 1. else we add -1 to reduce it from positive to 0
	int d = a < 0 ? 1 : -1;
	// 2-pronged addition so we can reduce/add "a" to 0 while
	// adding/reducing a number from 0 and returning it
	while (a != 0) {
	    neg += d;
	    a += d;
	}
	return neg;
    }

    public int divide(int a, int b) {
	int result = 0;
	int abA = absolute(a);
	int abB = absolute(b);
	while (abA >= abB) {
	    abA += negate(abB);
	    result += 1;
	}
	if (a < 0 && b < 0 || a > 0 && b > 0)
	    return result;
	else
	    return negate(result);
    }
}
