//Write a program to check if a given number is prime or not.

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = scan.nextInt();
		int count = 0;
		
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				count++;
			}
			else {
				continue;
			}
		}
		if(count == 0) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is NOT prime");
		}
	}

}
