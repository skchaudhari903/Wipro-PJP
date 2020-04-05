/*Create a class called GeneralBank that acts as base class for all banks. 
 This class has getSavingsInterestRate and getFixedDepositInterestRate methods, 
 which returns the savings account interest rate and fixed deposit account interest rate that the specific bank gives. 
 Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.

Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and 
KotMBank - Savings 6% Fixed 9%.

Create a main method to test the above classes and their methods. Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();

b) KotMBank k=new KotMBank();

c) GeneralBank g=new KotMBank();

d) GeneralBank g=new ICICIBank();
*/

abstract class GeneralBank {
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank {

	@Override
	double getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return 8.5;
	}
	
}

class KotMBank extends GeneralBank {

	@Override
	double getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();
		System.out.println("ICICI BANK: " + 
				"Fixed Rate = " + iciciBank.getFixedDepositInterestRate() + "%, " + 
				"Saving Rate = " + iciciBank.getSavingsInterestRate() + "%");
		System.out.println("KOTAK MAHINDRA BANK: " + 
				"Fixed Rate = " + kotMBank.getFixedDepositInterestRate() + "%, " + 
				"Saving Rate = " + kotMBank.getSavingsInterestRate() + "%");
		System.out.println("----------------------------------------------------------");
		GeneralBank gBank1 = new ICICIBank();
		GeneralBank gBank2 = new KotMBank();
		System.out.println("GENERAL BANK1: " + 
				"Fixed Rate = " + gBank1.getFixedDepositInterestRate() + "%, " + 
				"Saving Rate = " + gBank1.getSavingsInterestRate() + "%");

		System.out.println("GENERAL BANK2: " + 
                "Fixed Rate = " + gBank2.getFixedDepositInterestRate() + "%, " + 
                "Saving Rate = " + gBank2.getSavingsInterestRate() + "%");	
	}

}
