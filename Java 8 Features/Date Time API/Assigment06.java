//Write a program to display the current time and the time before 5 hours and 30 minutes.

import java.time.LocalTime;

public class Assigment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time );
		System.out.println("Time before 5 hours 30 minutes : " + time.minusMinutes(30).minusHours(5) );
	}

}
