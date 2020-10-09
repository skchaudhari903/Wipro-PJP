package com.abhishek.springboot;

import org.springframework.stereotype.Component;

@Component
public class Battery {

	private String bname;

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Battery [bname=" + bname + "]";
	}

	public void display() {
		System.out.println("Samsung Battery.");
	}

}
