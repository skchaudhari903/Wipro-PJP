import java.util.Scanner;

import Exception.InvalidAge;
import Exception.InvalidAmount;
import Exception.InvalidNoOfDays;

public class InterestCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.print("\n1. Interest Calculator – SB: ");
			System.out.print("\n2. Interest Calculator – FD: ");
			System.out.print("\n3. Interest Calculator – RD: ");
			System.out.print("\n4. Exit");
			System.out.print("\nEnter your option (1..4): ");
			
			choice  = scan.hasNextInt() ? scan.nextInt() : 0;
			
			switch (choice) {
			case 1:
				SBAccount sbAccount = new SBAccount();
				System.out.print("\nEnter the Average amount in your account: ");
				double input = scan.nextDouble();
				
				try {
					if(input<0) {
						throw new InvalidAmount();
					}
					else {
						sbAccount.setAmount(input);
						System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
					}
				}
				catch(InvalidAmount e) {}
				break;
				
			case 2:
				FDAccount fdAccount = new FDAccount();
				
				System.out.print("\nEnter the FD ammount: ");
				double input2 = scan.nextDouble();
				
				System.out.print("\nEnter number of days: ");
				int noOfDays = scan.nextInt();
				
				System.out.print("\nEnter your age: ");
				int age = scan.nextInt();
				
				try {
					if(input2 < 0) {
						throw new InvalidAmount();
					}
					else if(noOfDays < 0) {
						throw new InvalidNoOfDays();
					}
					else if(age < 0) {
						throw new InvalidAge();
					}
					else {
						fdAccount.setAmount(input2);
						fdAccount.setNoOfDays(noOfDays);
						fdAccount.setAgeOfACHolder(age);
						System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest());
					}
					
				}
				catch(InvalidAmount e) {}
				catch(InvalidNoOfDays e) {}
				catch(InvalidAge e) {}
				break;
				
			case 3:
				RDAccount rdAccount = new RDAccount();
				
				System.out.print("\nEnter the RD ammount: ");
				double input3 = scan.nextDouble();
				
				System.out.print("\nEnter number of months: ");
				int noOfMonths = scan.nextInt();
				
				System.out.print("\nEnter your age: ");
				age = scan.nextInt();
				
				try {
					if(input3 < 0) {
						throw new InvalidAmount();
					}
					else if(noOfMonths < 0) {
						throw new InvalidNoOfDays();
					}
					else if(age < 0) {
						throw new InvalidAge();
					}
					else {
						rdAccount.setAmount(input3);
						rdAccount.setNoOfMonth(noOfMonths);
						rdAccount.setAgeOfACHolder(age);
						System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest());
					}
				}
				catch(InvalidAmount e) {}
				catch(InvalidNoOfDays e) {}
				catch(InvalidAge e) {}
				break;
				
			case 4:
				System.out.println("Thanks for using Interest Calculator.");
				break;
				
			default:
				break;
			}
		} while (choice != 4);
		scan.close();
	}

}
