// Write a program to display the current time and the time after 25 minutes.

import java.time.LocalTime;

public class Assigment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time );
		System.out.println("Time after 25 minutes : " + time.plusMinutes(25));
	}

}
