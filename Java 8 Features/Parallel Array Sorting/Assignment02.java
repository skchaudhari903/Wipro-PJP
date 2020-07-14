/*Write a program as per the below instructions: 

a) Take any String as a input from the user. And convert this string into character array (you may use toCharArrayMethod()). 
b) Sort this character array using parallelSort() method. After sorting convert this character array into a String and display this String as a result.

Example: 
Input : valan
Output : aalnv
*/

import java.util.Arrays;
import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.next();
		char[] array = str.toCharArray();
		Arrays.parallelSort(array);
		str = new String(array);
		System.out.println(str);
	}

}
