package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Car_Details")
public class CarDetails {
	
	@Id
	private String regNo;
	
	private String model;
	
	private String color;
	
	@Column (name="Manufacturer")
	private String manuf;

	public CarDetails() {
		
	}
	public CarDetails(String regNo, String model, String color, String manuf) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.manuf = manuf;
	}
	
	public String getRegNo() {
		return this.regNo;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public String getManufacturer() {
		return this.manuf;
	}
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setModel(String model) {
		 this.model = model;
	}
	public void setColor(String color) {
		 this.color = color;
	}
	public void setManufacturer(String manuf) {
		 this.manuf = manuf;
	}
	
	@Override
	public String toString() {
		return "CarDetails [Reg No.: " + this.regNo + 
				",\tModel: " + this.model +
				",\tColor: " + this.color +
				",\tManufacturer: " + this.manuf + "]";
	}

}
