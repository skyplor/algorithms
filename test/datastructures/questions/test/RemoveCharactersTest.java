package datastructures.questions.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import datastructures.questions.RemoveCharacters;

public class RemoveCharactersTest {
    String str = "aattle of the Vowels: Hawaii vs. Grozny", remove = "aeiou";
    String Output = "ttl f th Vwls: Hw vs. Grzny";
    RemoveCharacters rc;

    @Before
    public void setUp() throws Exception {
	rc = new RemoveCharacters();
    }

    @Test
    public void test2ndOption() {
	assertEquals(Output, rc.removeChars2(str, remove));
    }

    @Test
    public void test2ndAltOption() {
	assertEquals(Output, rc.removeChars2Alt(str, remove));
    }

    @Test
    public void test2ndAlt2Option() {
	assertEquals(Output, rc.removeChars2Alt2(str, remove));
    }

    @Test
    public void test3rdOption() {
	assertEquals(Output, rc.removeChars3(str, remove));
    }
}
