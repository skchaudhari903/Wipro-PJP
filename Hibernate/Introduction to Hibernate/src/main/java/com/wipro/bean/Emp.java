package com.wipro.bean;

import java.sql.Date;

public class Emp {
	private int no;
	private String name;
	private String job;
	private int manager;
	private Date hireDate;
	private double salary;
	private double commission;
	private int deptNo;
	
	public Emp() {
		
	}
	public Emp(int no,
			String name,
			String job,
			int manager,
			Date hireDate,
			double salary,
			double commission,
			int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.manager = manager;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}
	
	public int getNo() {
		return this.no;
	}
	public String getName() {
		return this.name;
	}
	public String getJob() {
		return this.job;
	}
	public int getManager() {
		return this.manager;
	}
	public Date getHireDate() {
		return this.hireDate;
	}
	public double getSalary() {
		return this.salary;
	}
	public double getCommission() {
		return this.commission;
	}
	public int getDeptNo() {
		return this.deptNo;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "Employee No.: " + this.no + 
				"\n\tName: " + this.name +
				"\n\tJob: " + this.job +
				"\n\tManager: " + this.manager +
				"\n\tJoined on: " + this.hireDate +
				"\n\tWith Salary: " + this.salary +
				"\n\tCommission: " + this.commission +
				"\n\tDepartment: " + this.deptNo;
	}
}
