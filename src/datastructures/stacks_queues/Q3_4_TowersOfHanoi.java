package datastructures.stacks_queues;

/**
 * Determines the steps needed to move disks from an origin to a destination. The worstTme(n) is 0(2 raised to n), where n is the number of disks to be moved
 * 
 * @param n
 *            the number of disks to be moved
 * @param orig
 *            the pole where the disks are originally
 * @param dest
 *            the destination pole
 * @param temp
 *            the pole used for temporary storage
 * 
 * @return a String representation of the moves needed
 * 
 * @throws IllegalArgumentException
 *             if n is < = 0
 */

public class Q3_4_TowersOfHanoi
{
	static String move(int n, char origin, char dest, char temp)
	{
		final String DIRECT_MOVE = "Move disk " + n + " from " + origin + " to " + dest + "\n";
		if (n <= 0)
		{
			throw new IllegalArgumentException();
		}
		if (n == 1)
		{
			return DIRECT_MOVE;
		}
		String result = move(n - 1, origin, temp, dest);
		result += DIRECT_MOVE;
		result += move(n - 1, temp, dest, origin);
		return result;
	}

	// end method move

	public static void main(String[] args)
	{
		System.out.println(move(4, 'A', 'B', 'C'));
	}
}
