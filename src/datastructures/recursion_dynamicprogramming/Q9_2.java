package datastructures.recursion_dynamicprogramming;

/**
 * Imagine a robot sitting on the upper left corner of an X by Y grid. The robot
 * can only move in two directions: right and down. How many possible paths are
 * there for the robot to go from (0,0) to (X,Y)?
 * 
 * @author Sky
 * 
 */
public class Q9_2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public static int numPathsRecusion(int x, int y) {
	if (x < 0 || y < 0)
	    return 0;
	if (x == 0 && y == 0)
	    return 1;
	return numPathsRecusion(x - 1, y - 1) * 2;
    }

    public static int numPathsDP(int x, int y, int[][] a) {
	if (x < 0 || y < 0)
	    return 0;
	if (x == 0 && y == 0)
	    return 1;
	if (a[x][y] == -1)
	    return a[x][y];
	a[x][y] = numPathsDP(x - 1, y - 1, a) * 2;
	return a[x][y];
    }
}
