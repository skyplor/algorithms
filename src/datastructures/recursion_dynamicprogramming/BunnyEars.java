package datastructures.recursion_dynamicprogramming;

/**
 * Part 1:
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
 * 
 * Part 2:
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
 * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
 * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
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

    public int bunnyEars2(int bunnies) {
	if (bunnies == 0)
	    return 0;
	else {
	    if ((bunnies % 2) == 0)
		return 3 + bunnyEars2(bunnies - 1);
	    else
		return 2 + bunnyEars2(bunnies - 1);
	}
    }
}
