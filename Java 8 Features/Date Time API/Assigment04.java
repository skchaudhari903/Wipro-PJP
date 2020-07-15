//Write a program to check whether the current year is a leap year.

import java.time.LocalDate;

public class Assigment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		if(date.isLeapYear())
			System.out.println("Current Year is a leap year");
		else
			System.out.println("Current Year is not a leap year");
	}

}
