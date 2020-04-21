public class RDAccount extends Account{
	private int noOfMonth;
	private double monthlyAmount; 
	private int ageOfACHolder;

	@Override
	public double calculateInterest() {
		double rateOfInterest = 0;
		double interest = 0;
		
		if (noOfMonth >= 6 && noOfMonth < 9) {
			rateOfInterest = 7.5;
		} else if (noOfMonth >= 9 && noOfMonth < 12) {
			rateOfInterest = 7.75;
		} else if (noOfMonth >= 12 && noOfMonth < 15) {
			rateOfInterest = 8;
		} else if (noOfMonth >= 15 && noOfMonth < 18) {
			rateOfInterest = 8.25;
		} else if (noOfMonth >= 18 && noOfMonth <= 21) {
			rateOfInterest = 8.5;
		} else if (noOfMonth >= 21) {
			rateOfInterest = 8.75;
		}
		
		if (ageOfACHolder >= 65) rateOfInterest += 0.5;
		
		interest = amount * rateOfInterest / 100;
		
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

	public int getNoOfMonth() {
		return noOfMonth;
	}

	public void setNoOfMonth(int noOfMonth) {
		this.noOfMonth = noOfMonth;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	
	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

}
