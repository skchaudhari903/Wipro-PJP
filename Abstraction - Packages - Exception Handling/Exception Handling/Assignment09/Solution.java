/*Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.

This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. 

In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.

Example1)
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block

Example2)
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block
*/

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int quotient = a / b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} 
		catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		} 
		finally {
			System.out.println("Inside finally block");
		}
	}

}
