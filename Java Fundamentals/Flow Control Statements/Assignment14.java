/*Write a Java program to find if the given number is prime or not.

Example1)
C:\>java Sample 
O/P: Please enter an integer number 

Example2)
C:\>java Sample 1
O/P:1 is neither prime nor composite

Example3)
C:\>java Sample 0
O/P: 0 is neither prime nor composite
 
Example4)
C:\>java Sample 10
O/P: 10 is not a prime number

Example5)
C:\>java Sample 7
O/P : 7 is a prime number
*/

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
            if(args.length >= 1) {
                num = Integer.parseInt(args[0]);
            }
            else {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter an integer number ");
                num = scan.nextInt();
            }

            if(num == 0 || num == 1) {
        	System.out.println(num + " is neither prime nor composite");
            }
            else {
        	if(isPrime(num))
                    System.out.println(num + " is a prime number");
                else
                    System.out.println(num + " is a not prime number");
            }
        }

        static boolean isPrime(int num) {
            for(int i=2; i <= num/2; i++) {
                if(num % i == 0)
                    return false;
            }
            return true;
	}

}
