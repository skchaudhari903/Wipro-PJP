package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	@Column(nullable = false, length=50)
	private String city;
	@Column(nullable = false, length=50)
	private String state;
	@Column(nullable = false, length=10)
	private String pinCode;

	public Address() {
	}

	public Address(String street, String city, String state, String pinCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [Street: " + this.street + 
				",\tCity: " + this.city +
				",\tState: " + this.state +
				",\tPIN Code: " + this.pinCode +
				"]";
	}

}

