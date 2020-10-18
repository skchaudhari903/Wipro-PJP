package com.abhishek.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private String lname;
	@Autowired
	private Battery b;
	@Autowired
	private Hard_disk hd;



	public Laptop() {
		super();
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public Hard_disk getHd() {
		return hd;
	}
	public void setHd(Hard_disk hd) {
		this.hd = hd;
	}
	@Override
	public String toString() {
		return "Laptop [lname=" + lname + ", b=" + b + ", hd=" + hd + "]";
	}

	public void Show() {
		System.out.println("Hello Laptop!");
		b.display();
		hd.display();
	}




}
