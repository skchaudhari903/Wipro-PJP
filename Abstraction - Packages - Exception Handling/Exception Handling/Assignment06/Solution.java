/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;

class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		System.out.println("NegativeValuesException occured");
	}
}

class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		System.out.println("ValuesOutOfRangeException occured");
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = null;
			int subA = 0;
			int subB = 0;
			int subC = 0;
			try {
				name = scan.nextLine();
				if (scan.hasNextInt())
					subA = scan.nextInt();
				else
					throw new NumberFormatException();
				if (scan.hasNextInt())
					subB = scan.nextInt();
				else
					throw new NumberFormatException();
				if (scan.hasNextInt())
					subC = scan.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeValuesException();
				if (subA > 100) throw new ValuesOutOfRangeException();
				
				if (subB < 0) throw new NegativeValuesException();
				if (subB > 100) throw new ValuesOutOfRangeException();
				
				if (subC < 0) throw new NegativeValuesException();
				if (subC > 100) throw new ValuesOutOfRangeException();		
            } 
            catch (ArithmeticException e) {
				System.out.println(e.getMessage());
            } 
            catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
            } 
            catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
	}

}
