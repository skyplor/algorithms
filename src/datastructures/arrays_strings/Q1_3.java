package datastructures.arrays_strings;

import java.util.Arrays;

/**
 * <p>
 * Given two strings, write a method to decide if one is a permutation of the other.
 * <p>
 * 
 * @author Sky
 * 
 */
public class Q1_3
{

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		String s1 = "abcde";
		String s2 = "eabcc";

		if (checkIterative(s1, s2))
		{
			System.out.println("checkIterative - String 1 is a permutation of String 2");
		}
		else
		{
			System.out.println("checkIterative - String 1 is not a permutation of String 2");
		}
		if (checkSort(s1, s2))
		{
			System.out.println("checkSort - String 1 is a permutation of String 2");
		}
		else
		{
			System.out.println("checkSort - String 1 is not a permutation of String 2");
		}
		if (checkIterative2(s1, s2))
		{
			System.out.println("checkIterative2 - String 1 is a permutation of String 2");
		}
		else
		{
			System.out.println("checkIterative2 - String 1 is not a permutation of String 2");
		}
	}

	/**
	 * Check iterative.
	 * 
	 * @param s1
	 *            the first string
	 * @param s2
	 *            the second string
	 * @return true, if equals
	 */
	private static boolean checkIterative(String s1, String s2)
	{
		// firstly, check if length of both strings are the same. If different, return false;
		if (s1.length() != s2.length())
		{
			return false;
		}
		else
		{
			boolean flag = true;

			// as long as we find a char in s1 that doesn't appear in s2, we return false;
			for (int i = 0; i < s1.length(); i++)
			{
				String character = s1.charAt(i) + "";
				// 2nd for loop will be dynamic
				for (int j = 0; j < s2.length(); j++)
				{
					String character2 = s2.charAt(j) + "";
					if (character.equals(character2))
					{
						flag = true;
						if (j == 0)
							s2 = s2.substring(j + 1);
						else if (j == s2.length() - 1)
							s2 = s2.substring(0, j);
						else
							s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
					else
					{
						flag = false;
					}
				}
				if (!flag)
				{
					break;
				}
			}
			return flag;
		}
	}

	/**
	 * Sort.
	 * 
	 * @param s
	 *            the string
	 * @return the string
	 */
	private static String sort(String s)
	{
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	/**
	 * Check sort.
	 * 
	 * @param s1
	 *            the first string
	 * @param s2
	 *            the second string
	 * @return true, if equals
	 */
	private static boolean checkSort(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		return sort(s1).equals(sort(s2));
	}

	/**
	 * Check iterative2.
	 * 
	 * @param s1
	 *            the first string
	 * @param s2
	 *            the second string
	 * @return true, if equals
	 */
	private static boolean checkIterative2(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		int[] letters = new int[256];
		char[] s1_char = s1.toCharArray();
		for (char c : s1_char)
		{
			letters[c]++;
		}
		for (int i = 0; i < s2.length(); i++)
		{
			int c = (int) s2.charAt(i);
			if (--letters[c] < 0)
			{
				return false;
			}
		}
		return true;
	}
}
