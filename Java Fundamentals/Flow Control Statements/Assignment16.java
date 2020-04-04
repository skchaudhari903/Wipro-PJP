/*Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
--------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		if(args.length == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an integer number:");
			count = scan.nextInt();
		}
		else {
			count = Integer.parseInt(args[0]);
		}
		System.out.println("Using For Loop :");
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("Using While Loop :");
		int i = count, j;													
		while(i >= 1){
		    j = i;
		    while(j <= count){
		    	System.out.print("*");
		        j++;
		    }
		    i--;
		    System.out.println(" ");
		}
	}
}
