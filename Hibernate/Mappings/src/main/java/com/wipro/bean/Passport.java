package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	private int id;
	private String passportNo;

	public Passport() {
		
	}
	public Passport(int id, String pno) {
		super();
		this.id = id;
		this.passportNo = pno;
	}
	public Passport(String pno) {
		super();
		this.passportNo = pno;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setPassportNo(String pno) {
		this.passportNo = pno;
	}
	
	public int getId() {
		return this.id;
	}
	public String getPassportNo() {
		return this.passportNo;
	}
	
	@Override
	public String toString() {
		return "Passport [ID: " + this.id + 
				",\tPassport No.: " + this.passportNo +
				"]";
	}

}
