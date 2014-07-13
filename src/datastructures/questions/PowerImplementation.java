package datastructures.questions;

/**
 * 
 * Returns a^b, as the standard mathematical exponentiation function
 * 
 * @author Sky
 * 
 */
public class PowerImplementation {

    public static void main(String[] args) {
	double a = 3.6;
	int b = 8;
	System.out.println(a + "^" + b + " = " + power(a, b));
	System.out.println(a + "^" + b + " = " + pow(a, b));
    }

    public static double power(double a, int b) {
	if (b == 0)
	    return 1;
	if (b == 1)
	    return a;
	if (b % 2 == 0)
	    return power(a * a, b / 2);
	else
	    return a * power(a * a, (b - 1) / 2);
    }

    public static double pow(double a, int b) {
	// implementation here
	if (a == 0 && b == 0)
	    return Integer.MIN_VALUE;

	if (a == 0)
	    return 0;

	if (b == 0)
	    return 1;

	if (b == 1)
	    return a;

	boolean aMinus = a < 0 ? true : false;
	boolean bMinus = b < 0 ? true : false;

	int bAbs = Math.abs(b);
	double aAbs = Math.abs(a);

	// check if b is odd
	double temp;
	if ((b & 1) != 0) {
	    temp = pow(aAbs, bAbs - 1) * aAbs;
	} else
	    temp = pow(aAbs * aAbs, bAbs / 2);

	if (bMinus)
	    temp = 1 / temp;
	if (aMinus && (b & 1) != 0)
	    temp = temp * -1;

	return temp;
    }
}
