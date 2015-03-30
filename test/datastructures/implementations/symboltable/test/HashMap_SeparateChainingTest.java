package datastructures.implementations.symboltable.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import datastructures.implementations.symboltable.HashMap_SeparateChaining;

public class HashMap_SeparateChainingTest {
    HashMap_SeparateChaining<Integer, String> hash;

    @Before
    public void setUp() throws Exception {
	hash = new HashMap_SeparateChaining<Integer, String>();
	hash.put(0, "0");
	hash.put(1, "1");
	hash.put(2, "2");
	hash.put(3, "3");
	hash.put(4, "4");
	hash.put(5, "5");
	hash.put(6, "6");
	for (int i = 0; i < hash.size(); i++) {
	    System.out.println(hash.get(i));
	}
    }

    @Test
    public void testRemove() {
	assertEquals(true, hash.remove(0));
	assertEquals(6, hash.size());
	for (int i = 0; i < hash.size(); i++) {
	    System.out.println(hash.get(i));
	}
    }

}
