package datastructures.mathematics_probability;

public class SieveOfEratosthenes {

    // public SieveOfEratosthenes ()
    public boolean[] sieve(int max) {
	boolean[] flags = new boolean[max + 1];

	int prime = 2;
	init(flags);

	while (prime <= Math.sqrt(max) && prime < flags.length) {
	    crossOff(flags, prime);
	    prime = getNextPrime(flags, prime);
	}
	return flags;
    }

    public void init(boolean[] flags) {
	flags[0] = false;
	flags[1] = false;
	for (int i = 2; i < flags.length; i++)
	    flags[i] = true;
    }

    public void crossOff(boolean[] flags, int prime) {

	for (int i = prime * prime; i < flags.length; i += prime) {
	    flags[i] = false;
	}
    }

    public int getNextPrime(boolean[] flags, int prime) {
	int next = prime + 1;
	while (next < flags.length && !flags[next])
	    next++;
	return next;
    }

    public static void main(String[] args) {
	SieveOfEratosthenes sieve = new SieveOfEratosthenes();
	boolean[] flags = sieve.sieve(100);
	System.out.println("Prime Numbers are:");
	for (int i = 0; i < flags.length; i++) {
	    if (flags[i])
		System.out.println(i);
	}
    }
}
