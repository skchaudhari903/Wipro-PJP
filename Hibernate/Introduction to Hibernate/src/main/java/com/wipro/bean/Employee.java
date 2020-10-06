package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	private String name;
	
	@Id
	private int id;
	
	private String designation;
	private int salary;

	public Employee() {
		
	}
	public Employee(String name, int id, String designation, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee(String name, String designation, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public String getDesignation() {
		return this.designation;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ID: " + this.id + 
				",\tName: " + this.name +
				",\tDesignation: " + this.designation +
				",\tSalary: " + this.salary + "]";
	}
}
