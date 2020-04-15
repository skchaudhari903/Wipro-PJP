//Implement the assignment 1 using Linked List
// Assignment 1 :Write a Java program to create an ArrayList, add all the months of a year and print the same.

import java.util.LinkedList;

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
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
