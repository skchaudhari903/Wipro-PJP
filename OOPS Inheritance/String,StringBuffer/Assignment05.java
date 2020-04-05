/*Write a java program that accepts a string and 
returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
*/

import java.util.Scanner;

public class Assignment05 {

	static String trimFirstLast(String str) {
		return str.substring(1, str.length()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(trimFirstLast(str));
	}

}
