package datastructures.recursion_dynamicprogramming;

/**
 * Part 1:
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
 * 
 * 
 * @author Sky
 * 
 */
public class BunnyEars {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
	    System.out.println(bunnyEars(i));
	}

    }

    public static int bunnyEars(int bunnies) {
	if (bunnies == 0)
	    return 0;
	else {
	    int result = 2 + bunnyEars(bunnies - 1);
	    return result;
	}
    }
}
