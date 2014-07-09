package datastructures.linkedlists;

/**
 * <p>
 * Write code to remove duplicates from an unsorted linked list.
 * <p>
 * FOLLOW UP
 * <p>
 * How would you solve this problem if a temporary buffer is not allowed?
 * <p>
 * E.g.<br>
 * "5->2->3->5->10->2->12" to <br>
 * "5->2->3->10->12"
 * 
 * @author Sky
 * 
 */
public class Q2_1
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
