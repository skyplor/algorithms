package datastructures.arrays_strings;

/**
 * <p>
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 * <p>
 * E.g.<br>
 * Input: aabcccccaaa<br>
 * Output: a2b1c5a3
 * 
 * @author Sky
 * 
 */
public class Q1_7
{

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		int[][] matrix = Q1_6.generateMatrix(3, 4, 0, 5);
		Q1_6.printMatrix(matrix);
		System.out.println();
		matrix = zeroMatrix(matrix);
		Q1_6.printMatrix(matrix);

	}

	/**
	 * Zero matrix.
	 * 
	 * @param matrix
	 *            the matrix
	 * @return the int[][]
	 */
	private static int[][] zeroMatrix(int[][] matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}

			}
		}
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (row[i] || column[j])
				{
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}

}
