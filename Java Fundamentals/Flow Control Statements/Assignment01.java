//Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("Number is Positive");
		}
		else if(num < 0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Zero");
		}
		
	}

}
