/*Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
*/

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int sum;
		
		for(sum = 0; num > 0; num = num/10) 
	        	sum = sum + (num % 10);
		
		System.out.println(sum);
	}
	

}
