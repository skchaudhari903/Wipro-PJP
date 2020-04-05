//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;

public class Assignment01 {
	
	static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
			}
		return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		if (isPalindrome(str))
			System.out.print("String is Palindrome!");
		else
			System.out.print("String is not Palindrome!");
	}

}
