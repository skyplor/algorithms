package datastructures.bit_manipulation;

/**
 * Write a program to swap odd and even bits in an integer with as few
 * instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3
 * are swapped, and soon).
 * 
 * @author Sky
 * 
 */
public class Q5_6_SwapBit {
    public static void main(String[] args) {
	int a = 1234;
	System.out.println(a + " - Before update: " + Integer.toBinaryString(a));
	System.out.println(a + " - After update: " + Integer.toBinaryString(swapBits(a)));
	System.out.println(a + " - After update: " + Integer.toBinaryString(swapOddEvenBits(a)));
    }

    public static int swapBits(int n) {
	for (int i = 0; i < 32; i += 2) {
	    boolean temp = getBit(n, i);
	    n = updateBit(n, i, getBit(n, i + 1));
	    n = updateBit(n, i + 1, temp);
	}
	return n;
    }

    private static boolean getBit(int n, int i) {
	return ((n & (1 << i)) != 0);
    }

    private static int updateBit(int n, int i, boolean bit) {
	int mask = 0;
	if (bit) {
	    mask = 1 << i;
	    return n | mask;
	} else {
	    mask = ~(1 << i);
	    return n & mask;
	}
    }

    /**
     * AND integer x with odd mask (0xAAAAAAAA) to extract odd bits.<br>
     * Bitwise shift left by 1 to move into even position.<br>
     * AND integer x with even mask (0x55555555) to extract even bits.<br>
     * Bitwise shift right by 1 to move into odd position.<br>
     * OR both the results to merge them.
     */
    public static int swapOddEvenBits(int x) {
	System.out.println(Integer.toBinaryString((x & 0xAAAAAAAA)));
	System.out.println(Integer.toBinaryString((x & 0x55555555) << 1));
	return (((x & 0xAAAAAAAA) >> 1) | ((x & 0x55555555) << 1));
    }
}
