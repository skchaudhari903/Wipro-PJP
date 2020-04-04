/*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
*/

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = scan.nextInt();
		int digit, reverse = 0;
		
		while(num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println(reverse);
	}

}
