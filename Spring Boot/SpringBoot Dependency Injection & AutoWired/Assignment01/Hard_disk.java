package com.abhishek.springboot;

import org.springframework.stereotype.Component;

@Component
public class Hard_disk {

	private String Hname;

	public String getHname() {
		return Hname;
	}

	public void setHname(String hname) {
		Hname = hname;
	}

	@Override
	public String toString() {
		return "Hard_disk [Hname=" + Hname + "]";
	}

	public void display() {
		System.out.println("Samsung Hard Disk.");
	}


}
