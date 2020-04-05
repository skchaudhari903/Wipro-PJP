/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
 where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/

import java.util.Scanner;

public class Assignment03 {

	static String copyString(String str) {
		String repStr = str.substring(0, 2);				//substring(beginIndex, endIndex)
		String outStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(copyString(str));
	}

}
