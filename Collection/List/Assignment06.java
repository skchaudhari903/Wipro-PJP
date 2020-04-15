//Implement the assignment 1 using Vector
// Assignment 1 :Write a Java program to create an ArrayList, add all the months of a year and print the same.

import java.util.Vector;

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list = new Vector<>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		
		System.out.println("Months :- "+list);
	}

}
