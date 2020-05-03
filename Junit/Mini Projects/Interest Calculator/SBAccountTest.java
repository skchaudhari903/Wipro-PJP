import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {

	SBAccount sbAccount = new SBAccount();

	@Test
	public void testSetInterestRate() {
		sbAccount.setInterestRate(5);
		assertEquals(5, sbAccount.getInterestRate(), 0);
	}

	@Test
	public void testSetAmount() {
		sbAccount.setAmount(10000.0);
		assertEquals(10000.0, sbAccount.getAmount(), 0.0);
	}
	
	@Test
	public void testCalculateInterest() {
		sbAccount.setAmount(10000.0);
		assertEquals(400.0, sbAccount.calculateInterest(), 0.0);
	}

}
