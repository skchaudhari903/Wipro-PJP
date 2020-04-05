/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
*/

import java.util.Scanner;

public class Assignment10 {

	static String lastRepeat(String str, int n) {
		String repStr = str.substring(str.length()-n);				//substring(beginIndex)
		String outStr = "";
		
		for(int i = 0; i  < n; i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		
		System.out.println(lastRepeat(str, n));
	}

}
