package datastructures.questions;

/**
 * Determine if a given string is a number. <br>
 * Number can be negative or float or both<br>
 * <br>
 * E.g.<br>
 * "-1.324" is a number.<br>
 * "-.123" is not a number.<br>
 * "1.3.2" is not a number.<br>
 * "132." is not a number.<br>
 * 
 * @author Sky
 * 
 */
public class CheckIsNumber {

    public static void main(String[] args) {
	String s = "-1.324";
	System.out.println("\"" + s + "\" is a number? " + isNumber(s));
    }

    public static boolean isNumber(String s) {
	char[] chars = s.toCharArray();
	boolean periodFound = false;
	boolean isNeg = false;
	if (chars[0] == '-')
	    isNeg = true;
	for (int x = isNeg ? 1 : 0; x < chars.length; x++) {
	    int ascii = (int) chars[x];
	    if (ascii < 48 || ascii > 57) {
		// if there are more than 2 periods found in the string, it is
		// not a number
		if (ascii == 56 && periodFound)
		    return false;
		else if (ascii == 46 && !periodFound) {
		    // if this is a negative number, we should not find a period
		    // right after the negative sign
		    if (isNeg && x > 1 && x < chars.length - 1)
			periodFound = true;
		    // if this is not a negative number, we should not find a
		    // period right at the start
		    else if (!isNeg && x > 0 && x < chars.length - 1)
			periodFound = true;
		    else
			return false;
		}

		else
		    return false;
	    }
	}
	return true;
    }
}
