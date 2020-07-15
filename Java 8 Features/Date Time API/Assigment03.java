//Write a program to calculate your experience (no of years, no of months & no of days) in Wipro.

import java.time.LocalDate;
import java.time.Period;

public class Assigment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate joiningDate = LocalDate.of(2015,5,5);
		Period d = Period.between(joiningDate,LocalDate.now());
		int days = d.getDays(); 
		int months = d.getMonths(); 
		int years = d.getYears();
		System.out.println("Experience : " + years + " years " + months + " months " + days + " days." );
	}

}
