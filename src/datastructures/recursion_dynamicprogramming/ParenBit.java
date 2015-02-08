package datastructures.recursion_dynamicprogramming;

public class ParenBit {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static String parenBit(String str) {
	if (str.startsWith("(") && str.endsWith(")"))
	    return str;
	if (!str.startsWith("("))
	    return parenBit(str.substring(1));
	if (!str.endsWith(")"))
	    return parenBit(str.substring(0, str.length() - 1));
	else
	    return str;
    }
}
