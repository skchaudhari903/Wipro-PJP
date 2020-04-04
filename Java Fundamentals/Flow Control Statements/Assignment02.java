 //Write a program to check if a given integer number is odd or even.

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = scan.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("Number is Odd");
		}
		else {
			System.out.println("Number is Even");
		}
	}

}
