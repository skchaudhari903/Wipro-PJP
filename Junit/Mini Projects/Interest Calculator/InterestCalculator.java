import java.util.Scanner;

import MiniProjects.Project02.Exception.InvalidAge;
import MiniProjects.Project02.Exception.InvalidAmount;
import MiniProjects.Project02.Exception.InvalidNoOfDays;

public class InterestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.print("\n1. Interest Calculator – SB: ");
			System.out.print("\n2. Interest Calculator – FD: ");
			System.out.print("\n3. Interest Calculator – RD: ");
			System.out.print("\n4. Exit");
			System.out.print("\nEnter your option (1..4): ");
			
			choice  = sc.hasNextInt() ? sc.nextInt() : 0;
			
			switch (choice) {
			case 1:
				SBAccount sbAccount = new SBAccount();
				System.out.print("\nEnter the Average amount in your account: ");
				double input=sc.nextDouble();
				
				try
				{
					if(input<0)
					{
						throw new InvalidAmount();
					}
					else
					{
						sbAccount.setAmount(input);
						System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
					}
					
				}
				catch(InvalidAmount e)
				{
					
				}
				
					
				
				break;
				
			case 2:
				FDAccount fdAccount = new FDAccount();
				
				System.out.print("\nEnter the FD ammount: ");
				double input2=sc.nextDouble();
				
				System.out.print("\nEnter number of days: ");
				int noOfDays = sc.nextInt();
				
				System.out.print("\nEnter your age: ");
				int age = sc.nextInt();
				
				try
				{
					if(input2<0)
					{
						throw new InvalidAmount();
						
					}
					else if(noOfDays<0)
					{
						throw new InvalidNoOfDays();
					}
					else if(age<0)
					{
						throw new InvalidAge();
					}
					else
					{
						
						fdAccount.setAmount(input2);
						fdAccount.setNoOfDays(noOfDays);
						fdAccount.setAgeOfACHolder(age);
						System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest());
					}
					
				}
				catch(InvalidAmount e)
				{
					
				}
				catch(InvalidNoOfDays e)
				{
					
				}
				catch(InvalidAge e)
				{
					
				}
				
				break;
				
			case 3:
				RDAccount rdAccount = new RDAccount();
				
				System.out.print("\nEnter the RD ammount: ");
				double input3=sc.nextDouble();
				
				System.out.print("\nEnter number of months: ");
				int noOfMonths = sc.nextInt();
				
				System.out.print("\nEnter your age: ");
				age = sc.nextInt();
				
				try
				{
					if(input3<0)
					{
						throw new InvalidAmount();
					}
					else if(noOfMonths<0)
					{
						throw new InvalidNoOfDays();
					}
					else if(age<0)
					{
						throw new InvalidAge();
					}
					else
					{
						rdAccount.setAmount(input3);
						rdAccount.setNoOfMonth(noOfMonths);
						rdAccount.setAgeOfACHolder(age);
						System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest());
					}
					
				}
				catch(InvalidAmount e)
				{
					
				}
				catch(InvalidNoOfDays e)
				{
					
				}
				catch(InvalidAge e)
				{
					
				}
			
				break;
				
			case 4:
				System.out.println("Thanks for using Interest Calculator.");
				break;
				
			default:
				break;
			}
				
		} while (choice != 4);
		
		sc.close();
	}

}
