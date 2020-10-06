package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Emp_Details")
public class Employee {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Passport passport;

	public Employee() {
		
	}
	public Employee(int id, String name, Passport pass) {
		super();
		this.id = id;
		this.name = name;
		this.passport = pass;
	}
	public Employee(String name, Passport pass) {
		super();
		this.name = name;
		this.passport = pass;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassport(Passport pass) {
		this.passport = pass;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Passport getPassport() {
		return this.passport;
	}
	
	@Override
	public String toString() {
		return "Employee [ID: " + this.id + 
				",\tName: " + this.name +
				",\t" + this.passport.toString() +
				"]";
	}

}
