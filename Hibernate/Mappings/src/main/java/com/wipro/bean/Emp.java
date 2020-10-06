package com.wipro.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Emp_Address")
public class Emp {
	
	@Id
	private int id;
	private String name;
	
	@Embedded
	private Address address;

	public Emp() {
		
	}
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Emp(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Address getAddress() {
		return this.address;
	}
	
	@Override
	public String toString() {
		return "Employee [ID: " + this.id + 
				",\tName: " + this.name +
				",\t" + this.address.toString() +
				"]";
	}

}
