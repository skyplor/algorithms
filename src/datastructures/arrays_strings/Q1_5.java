package datastructures.arrays_strings;

/**
 * <p>
 * Implement a method to perform basic string compression using the counts of repeated characters. If the "compressed" string would not become smaller than the original string, your method should return the original string.
 * <p>
 * E.g.<br>
 * Input: aabcccccaaa<br>
 * Output: a2b1c5a3
 * 
 * @author Sky
 * 
 */
public class Q1_5
{

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		// String input = "aabcccccaaa";
		String input = "ab";
		System.out.println(compressString(input));

	}

	/**
	 * Compress string.
	 * 
	 * @param input
	 *            the input
	 * @return the string
	 */
	private static String compressString(String input)
	{
		// Start from head, while the next char is the same, count + 1. When exit, write this char and the count into another string.
		// Point to the next char by adding the count. Enter the while loop again.
		// To assume that capital letters are different from small letters
		int pointer = 0, count = 0, totalcount = 0;
		char current;
		String compressedStr = input;
		if (input == null || input.isEmpty())
		{
			return compressedStr;
		}
		else
		{
			compressedStr = "";
			current = input.charAt(pointer);
			while (totalcount != input.length())
			{
				count = 0;
				current = input.charAt(pointer);
				while (pointer < input.length() && input.charAt(pointer) == current)
				{
					count++;
					pointer++;
				}
				compressedStr = compressedStr + current + "" + count;
				totalcount += count;
			}
			if (compressedStr.length() >= input.length())
			{
				return input;
			}
			return compressedStr;
		}
	}

	/**
	 * Compress better.
	 * 
	 * @param str
	 *            the str
	 * @return the string
	 */
	private static String compressBetter(String str)
	{
		/* Check if compression would create a longer string */
		int size = countCompression(str);
		if (size >= str.length())
		{
			return str;
		}
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++)
			// Found repeated char
			if (str.charAt(i) == last)
			{
				count++;
			}
			// Insert char count,and update last char
			else
			{
				{
					mystr.append(last); // Insert char
					mystr.append(count); // Insert count
					last = str.charAt(i);
					count = 1;
				}
			}
		/*
		 * In lines 85 - 86 above, characters are inserted when the repeated character changes. We need to update the string at the end of the method as well, since the very last set of repeated characters wouldn't be set in the compressed string yet.
		 */
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}

	/**
	 * Compress alternate.
	 * 
	 * @param str
	 *            the str
	 * @return the string
	 */
	private static String compressAlternate(String str)
	{
		/* Check if compression would create a longer string */
		int size = countCompression(str);
		if (size >= str.length())
		{
			return str;
		}
		char[] array = new char[size];
		int index = 0;
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) == last) // Found repeated character
			{
				count++;
			}
			else
			{
				/* Update the repeated character count */
				index = setChar(array, last, index, count);
				last = str.charAt(i);
				count = 1;
			}
		}
		/* Update string with the last set of repeated characters. */
		index = setChar(array, last, index, count);
		return String.valueOf(array);
	}

	/**
	 * Sets the char.
	 * 
	 * @param array
	 *            the array
	 * @param c
	 *            the c
	 * @param index
	 *            the index
	 * @param count
	 *            the count
	 * @return the int
	 */
	private static int setChar(char[] array, char c, int index, int count)
	{
		array[index] = c;
		index++;
		/* Convert the count to a string, then to an array of chars */
		char[] cnt = String.valueOf(count).toCharArray();
		/* Copy characters from biggest digit to smallest */
		for (char x : cnt)
		{
			array[index] = x;
			index++;
		}
		return index;
	}

	/**
	 * Count compression.
	 * 
	 * @param str
	 *            the str
	 * @return the int
	 */
	private static int countCompression(String str)
	{
		if (str == null || str.isEmpty())
			return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) == last)
			{
				count++;
			}
			else
			{
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
}
