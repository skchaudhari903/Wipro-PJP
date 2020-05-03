import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	RDAccount rdAccount = new RDAccount();
	
	@Test
	public void testSetInterestRate() {
		rdAccount.setInterestRate(5);
		assertEquals(5, rdAccount.getInterestRate(), 0);
	}

	@Test
	public void testSetAmount() {
		rdAccount.setAmount(10000.0);
		assertEquals(10000.0, rdAccount.getAmount(), 0.0);
	}

	@Test
	public void testSetMonthlyAmount() {
		rdAccount.setMonthlyAmount(500);
		assertEquals(500, rdAccount.getMonthlyAmount(), 0);
	}
	
	@Test
	public void testSetAgeOfACHolder() {
		rdAccount.setAgeOfACHolder(65);
		assertEquals(65, rdAccount.getAgeOfACHolder());
	}
	
	@Test
	public void testCalculateInterest() {
		rdAccount.setAmount(10000.0);
		rdAccount.setNoOfMonth(6);
		rdAccount.setAgeOfACHolder(65);
		assertEquals(800.0, rdAccount.calculateInterest(), 0.0);
	}

}
