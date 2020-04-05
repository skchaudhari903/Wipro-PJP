/*Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
*/

import java.util.Scanner;

public class Assignment06 {
	
	static String shortLongShort(String str1, String str2) {
			if(str1.length() < str2.length())
				return str1 + str2 + str1;
			else
				return str2 + str1 + str2;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the 1st string: ");
		String a = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String b = scan.nextLine();
		
		System.out.println(shortLongShort(a, b));
	}

}
