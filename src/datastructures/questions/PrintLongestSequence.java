package datastructures.questions;

import java.util.HashMap;

/**
 * Given a NxN matrix which contains all distinct 1 to n^2 numbers, write code
 * to print sequence of increasing adjacent sequential numbers.<br>
 * <br>
 * E.g.<br>
 * 1 5 9<br>
 * 2 3 8<br>
 * 4 6 7<br>
 * Output: 6 7 8 9
 * 
 * @author Sky
 * 
 */
public class PrintLongestSequence {
    public static void main(String[] args) {
	int[][] matrix = new int[4][4];
	matrix[0][0] = 1;
	matrix[0][1] = 5;
	matrix[0][2] = 9;
	matrix[1][0] = 2;
	matrix[1][1] = 3;
	matrix[1][2] = 8;
	matrix[2][0] = 4;
	matrix[2][1] = 6;
	matrix[2][2] = 7;
	matrix[0][3] = 10;
	matrix[1][3] = 11;
	matrix[2][3] = 12;
	matrix[3][0] = 13;
	matrix[3][1] = 14;
	matrix[3][2] = 15;
	matrix[3][3] = 16;

	printMatrix(matrix);

	printLongestSnake(matrix);

	int[][] matrix2 = new int[3][3];
	matrix2[0][0] = 1;
	matrix2[0][1] = 5;
	matrix2[0][2] = 9;
	matrix2[1][0] = 2;
	matrix2[1][1] = 3;
	matrix2[1][2] = 8;
	matrix2[2][0] = 4;
	matrix2[2][1] = 6;
	matrix2[2][2] = 7;

	printMatrix(matrix2);

	printLongestSnake(matrix2);
    }

    private static void printMatrix(int[][] matrix) {
	HashMap<Integer, Coordinate> map = new HashMap<Integer, Coordinate>();
	for (Integer k: map.keySet()) {
	    
	}
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[0].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
	System.out.println();
    }

    static void printLongestSnake(int[][] matrix) {
	int n = matrix.length;
	int nSquared = n * n;
	Coordinate[] positions = new Coordinate[nSquared];
	for (int i = 0; i < n; ++i) {
	    for (int j = 0; j < n; ++j) {
		positions[matrix[i][j] - 1] = new Coordinate(i, j);
	    }
	}
	int maxLength = 1;
	int maxEnd = 1;
	int currentLength = 1;
	for (int i = 1; i < nSquared; ++i) {
	    if (positions[i].isAdjacent(positions[i - 1])) {
		++currentLength;
	    } else {
		if (currentLength > maxLength) {
		    maxLength = currentLength;
		    maxEnd = i;
		}
		currentLength = 1;
	    }
	}
	if (currentLength > maxLength) {
	    maxLength = currentLength;
	    maxEnd = nSquared;
	}
	for (int i = maxEnd - maxLength + 1; i < maxEnd; ++i) {
	    System.out.print(i + " ");
	}
	System.out.println(maxEnd);
	System.out.println();
    }
}

class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public boolean isAdjacent(Coordinate c) {
	if (x == c.x && (y == c.y - 1 || y == c.y + 1)) {
	    return true;
	}
	if (y == c.y && (x == c.x - 1 || x == c.x + 1)) {
	    return true;
	}
	return false;
    }
}
