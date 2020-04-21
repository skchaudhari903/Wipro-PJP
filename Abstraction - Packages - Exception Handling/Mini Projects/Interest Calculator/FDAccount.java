public class FDAccount extends Account{

	private int noOfDays;
	private int ageOfACHolder;

	@Override
	public double calculateInterest() {
		double rateOfInterest = 0;
		double interest= 0;
		
		if (amount < 10000000) 
		{
			if (noOfDays >= 7 && noOfDays <= 14) 
			{
				rateOfInterest = 4.5;
			} else if (noOfDays > 15 && noOfDays <= 29) 
			{
				rateOfInterest = 4.75;
			} else if (noOfDays >= 30 && noOfDays <= 45)
			{
				rateOfInterest = 5.5;
			} else if (noOfDays >= 46 && noOfDays <= 60) 
			{
				rateOfInterest = 7;
			} else if (noOfDays >= 61 && noOfDays <= 184) 
			{
				rateOfInterest = 7.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) 
			{
				rateOfInterest = 8;
			}
			
			if (ageOfACHolder >= 65)
				rateOfInterest += 0.5;
		} 
		else {
			if (noOfDays >= 7 && noOfDays <= 14) 
			{
				rateOfInterest = 6.5;
			} else if (noOfDays >= 15 && noOfDays <= 29)
			{
				rateOfInterest = 6.75;
			} else if (noOfDays >= 30 && noOfDays <= 45)
			{
				rateOfInterest = 6.75;
			} else if (noOfDays >= 46 && noOfDays <= 60) 
			{
				rateOfInterest = 8;
			} else if (noOfDays >= 61 && noOfDays <= 184) 
			{
				rateOfInterest = 8.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) 
			{
				rateOfInterest = 10;
			}
		}
		
		interest = amount * rateOfInterest / 100;
		
		return interest;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
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
