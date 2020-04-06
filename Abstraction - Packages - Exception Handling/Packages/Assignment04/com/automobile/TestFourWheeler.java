package com.automobile;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class TestFourWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford ford = new Ford("Ford Ecosport", "MP68MC6060", "Ajay Singh", 170);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.speed()+" kmph");
		ford.tempControl();
		
		System.out.println();
		
		Logan logan = new Logan("Mahindra Logan", "M15FD5103", "Vijay Singh", 180);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.speed()+" kmph");
		logan.gps();
	}

}
