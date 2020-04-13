import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {
	
	Demo2 demo2 = new Demo2();
	
	@Test
	public void testPalindromeCheck() {
		assertTrue(demo2.palindromeCheck("madam"));
		assertTrue(demo2.palindromeCheck("mom"));
		assertTrue(demo2.palindromeCheck("dad"));
		assertTrue(demo2.palindromeCheck("malayalam"));
		assertFalse(demo2.palindromeCheck("kerala"));
		assertFalse(demo2.palindromeCheck("india"));
	}

}
