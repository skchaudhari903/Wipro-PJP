public class SBAccount extends Account{
	
	@Override
	public double calculateInterest() {
		String accountType = "Normal";
		
		if (accountType.equals("Normal"))
			setInterestRate(4);
		else if(accountType.equals("NRI"))
			setInterestRate(6);
			
		double amount = getAmount();
		double interestRate = getInterestRate();
		double interest = amount * interestRate / 100.0;
		
		return interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
