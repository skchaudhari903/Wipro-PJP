package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	private String name;
	
	@Id
	private int id;
	
	private int price;

	public Product() {
		
	}
	public Product(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [ID: " + this.id + 
				",\tName: " + this.name +
				",\tPrice: " + this.price + "]";
	}
}
