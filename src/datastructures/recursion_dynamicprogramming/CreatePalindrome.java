package datastructures.recursion_dynamicprogramming;

import java.util.Scanner;

public class CreatePalindrome {

    public static void main(String[] args) {
	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	Scanner input = new Scanner(System.in);
	int size = input.nextInt();
	input.nextLine();
	for (int i = 0; i < size; i++) {
	    System.out.println(makePalindrome(input.nextLine()));
	}
    }

    public static int makePalindrome(String input) {
	if (input.length() < 2)
	    return 0;
	int left = 0;
	int right = input.length() - 1;
	// compare and reduce
	int first = input.charAt(left);
	int second = input.charAt(right);
	int difference = Math.abs(first - second);
	return difference + makePalindrome(input.substring(left + 1, right));
    }

}
