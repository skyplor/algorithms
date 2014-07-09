package datastructures.arrays_strings;

/**
 * <p>
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 * <p>
 * E.g.<br>
 * <table>
 * <thead>
 * <tr>
 * <th>
 * Input Matrix</th>
 * <th>
 * Rotated Matrix</th>
 * </tr>
 * </thead> <tbody>
 * <tr>
 * <td align=middle>1, 2, 3<br>
 * 4, 5, 6<br>
 * 7, 8, 9<br>
 * </td>
 * <td align=middle style="border-left: 1px solid black; padding: 5px;">
 * 7, 4, 1<br>
 * 8, 5, 2<br>
 * 9, 6, 3</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author Sky
 * 
 */
public class Q1_6
{

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		int[][] matrix1 = generateMatrix(3, 3, 1, 9);
		int[][] matrix2 = generateMatrix(3, 3, 1, 9);
		int value = 0;
		for (int row = 0; row < 3; row++)
		{
			for (int column = 0; column < 3; column++)
			{
				value++;
				matrix1[row][column] = value;
				matrix2[row][column] = value;
			}
		}
		printMatrix(matrix1);
		System.out.println();
		matrix1 = rotateMatrix(matrix1);
		printMatrix(matrix1);
		System.out.println();
		printMatrix(matrix2);
		System.out.println();
		matrix2 = alt_rotateMatrix(matrix2);
		printMatrix(matrix2);

	}

	/**
	 * Generate matrix.
	 * 
	 * @param row
	 *            the row
	 * @param column
	 *            the column
	 * @param minValue
	 *            the min value
	 * @param maxValue
	 *            the max value
	 * @return the int[][]
	 */
	public static int[][] generateMatrix(int row, int column, int minValue, int maxValue)
	{
		int[][] matrix = new int[row][column];
		int value = minValue;
		for (int row1 = 0; row1 < matrix.length; row1++)
		{
			for (int column1 = 0; column1 < matrix[0].length; column1++)
			{
				matrix[row1][column1] = value;
				if (value < maxValue)
					value++;
				else if (value == maxValue)
					value = minValue;
			}
		}
		return matrix;
	}

	/**
	 * Prints the matrix.
	 * 
	 * @param matrix
	 *            the matrix
	 */
	public static void printMatrix(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[0].length; column++)
			{
				if (column == matrix[0].length - 1)
				{
					System.out.print(matrix[row][column]);
				}
				else
					System.out.print(matrix[row][column] + ", ");
			}
			System.out.println();
		}
	}

	/**
	 * Rotates the matrix.
	 * 
	 * @param matrix
	 *            the matrix
	 * @return the int[][]
	 */
	private static int[][] rotateMatrix(int[][] matrix)
	{
		for (int layer = 0; layer < matrix.length / 2; ++layer)
		{
			int first = layer;
			int last = matrix.length - 1 - layer;
			for (int i = first; i < last; ++i)
			{
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return matrix;
	}

	/**
	 * Alt_rotate matrix. We do a transpose first, then reflect along the center.
	 * 
	 * @param matrix
	 *            the matrix
	 * @return the int[][]
	 */
	private static int[][] alt_rotateMatrix(int[][] matrix)
	{
		matrix = transposeMatrix(matrix);
		matrix = reflectMatrix(matrix);
		return matrix;
	}

	/**
	 * Reflect matrix.
	 * 
	 * @param matrix
	 *            the matrix
	 * @return the int[][]
	 */
	private static int[][] reflectMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length / 2; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
				matrix[i][matrix[0].length - 1 - j] = temp;
			}
		}
		return matrix;
	}

	/**
	 * Transpose matrix.
	 * 
	 * @param matrix
	 *            the matrix
	 * @return the int[][]
	 */
	private static int[][] transposeMatrix(int[][] matrix)
	{
		// Transpose, where matrix.length == matrix[0].length
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = i + 1; j < matrix[0].length; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
	}
}
