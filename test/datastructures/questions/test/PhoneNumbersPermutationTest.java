package datastructures.questions.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import datastructures.questions.PhoneNumbersPermutation;

public class PhoneNumbersPermutationTest {

    @Test
    public void testSetup() {
	PhoneNumbersPermutation phone = new PhoneNumbersPermutation();
	ArrayList<String> list = phone.getLetters(2);
	assertEquals("[A, B, C]",list.toString());
    }

}
