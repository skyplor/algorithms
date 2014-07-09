package datastructures.arrays_strings;

/**
 * <p>
 * Write a method to replace all spaces in a string with'%20'. You may assume that the string has sufficient space at the end of the string to hold the additional characters, and that you are given the "true" length of the string. <br>
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
 * <p>
 * E.g.<br>
 * Input: "Mr John Smith &nbsp&nbsp&nbsp&nbsp"<br>
 * Output: "Mr%20John%20Smith"
 * 
 * @author Sky
 * 
 */
public class Q1_4
{

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		// 5 spaces at the back for the extra chars to be added in, including the null delimiter
		String input = "Mr John Smith     ";
		int length = 13;
		System.out.println(replaceString(input, length));

	}

	/**
	 * Replace string.
	 * 
	 * @param input
	 *            the input
	 * @param length
	 *            the length
	 * @return the string
	 */
	private static String replaceString(String input, int length)
	{
		char[] input_array = input.toCharArray();
		int countSpaces = 0;
		// First loop we check how many spaces are there by going from the head.
		for (int i = 0; i < length; i++)
		{
			if (input_array[i] == ' ')
			{
				countSpaces++;
			}
		}
		int newLength = length + countSpaces * 2;
		// we can put a null char at the end of the string array to signal the end of the string. With this, we have to allocate 1 extra space in the input. If we don't want this, we can save the 1 extra space
		input_array[newLength] = '\0';
		// Second loop we do the actual replacement by going from the tail.
		for (int j = length - 1; j >= 0; j--)
		{
			if (input_array[j] == ' ')
			{
				input_array[newLength - 1] = '0';
				input_array[newLength - 2] = '2';
				input_array[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else
			{
				input_array[newLength - 1] = input_array[j];
				newLength = newLength - 1;
			}
		}

		return new String(input_array);
	}
}
