package datastructures.arrays_strings;

/**
 * <p>
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring.
 * <p>
 * E.g.<br>
 * "erbottlewat" is a rotation of "waterbottle".
 * 
 * @author Sky
 * 
 */
public class Q1_8
{

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		String input1 = "waterbottle";
		String input2 = "erbottlewat";
		// Check if strings have same length.
		if (input1.length() != input2.length())
		{
			System.out.println(input2 + " is NOT a rotation of " + input1);
		}
		else
		{
			System.out.println();
			if (isSubstring(input1 + input1, input2))
				System.out.println(input2 + " is a rotation of " + input1);
			else
				System.out.println(input2 + " is NOT a rotation of " + input1);
		}
	}

	/**
	 * Checks if input2 is substring of input1.
	 * 
	 * @param input1
	 *            the first input
	 * @param input2
	 *            the second input
	 * @return true, if is substring
	 */
	private static boolean isSubstring(String input1, String input2)
	{
		return input1.contains(input2);
	}

}
