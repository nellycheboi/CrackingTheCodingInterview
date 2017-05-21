package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrayAndStrings.AllUniqueCharacters;
import arrayAndStrings.ReverseCStyleString;

public class StringsTest {
	AllUniqueCharacters allUniqueCharacters = new AllUniqueCharacters();
	ReverseCStyleString reverseString = new ReverseCStyleString ();
	@Test
	public void allUniqueCharactersTest() {
		assertTrue(allUniqueCharacters.allUniqueChars("@@/*-nely"));
		assertFalse(allUniqueCharacters.allUniqueChars("1233"));
		assertTrue(allUniqueCharacters.allUniqueChars(""));
		assertFalse(allUniqueCharacters.allUniqueChars("nelly"));
		
	}
	@Test
	public void reverseCStyleString(){
		assertEquals("dcban", reverseString.reverseCstyleString("abcdn"));
		assertEquals("cban", reverseString.reverseCstyleString("abcn"));
		assertEquals("n", reverseString.reverseCstyleString("n"));
	}

}
