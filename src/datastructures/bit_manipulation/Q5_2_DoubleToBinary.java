package datastructures.bit_manipulation;

/**
 * Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a
 * double, print the binary representation. If the number cannot be represented
 * accurately in binary with at most 32 characters, print "ERROR
 * 
 * @author Sky
 * 
 */
public class Q5_2_DoubleToBinary {

    public static void main(String[] args) {
	Double d = 0.123;
	System.out.println("Binary of " + d + " is: " + printBinary(d));
	String bs = printBinary(.125);
	System.out.println(bs);

	for (int i = 0; i < 1000; i++) {
	    double num = i / 1000.0;
	    String binary = printBinary(num);
	    String binary2 = printBinary2(num);
	    String binary3 = printBinary3(num);
	    if (!binary.equals("ERROR") || !binary2.equals("ERROR")
		    || !binary3.equals("ERROR")) {
		System.out.println(num + " : " + binary + " " + binary2 + " "
			+ binary3);
	    }
	}
    }

    public static String printBinary(Double num) {
	int size = 0;
	StringBuilder sb = new StringBuilder();
	while (num != 1) {
	    num *= 2;
	    if (size >= 32)
		return "ERROR";
	    if (num > 1) {
		size++;
		sb.append("1");
		num = num - 1;
	    } else if (num < 1) {
		size++;
		sb.append("0");
	    }
	}
	if (num == 1) {
	    sb.append("1");
	}
	return sb.toString();
    }

    public static String printBinary2(double num) {
	if (num >= 1 || num <= 0) {
	    return "ERROR";
	}

	StringBuilder binary = new StringBuilder();
	binary.append(".");
	while (num > 0) {
	    /* Setting a limit on length: 32 characters */
	    if (binary.length() > 32) {
		return "ERROR";
	    }
	    double r = num * 2;
	    if (r >= 1) {
		binary.append(1);
		num = r - 1;
	    } else {
		binary.append(0);
		num = r;
	    }
	}
	return binary.toString();
    }

    public static String printBinary3(double num) {
	if (num >= 1 || num <= 0) {
	    return "ERROR";
	}

	StringBuilder binary = new StringBuilder();
	double frac = 0.5;
	binary.append(".");
	while (num > 0) {
	    /* Setting a limit on length: 32 characters */
	    if (binary.length() >= 32) {
		return "ERROR";
	    }
	    if (num >= frac) {
		binary.append(1);
		num -= frac;
	    } else {
		binary.append(0);
	    }
	    frac /= 2;
	}
	return binary.toString();
    }
}
