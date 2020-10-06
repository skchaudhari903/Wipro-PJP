package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flower {
	
	@Id
	@Column (name="FlowerID")
	private String id;
	
	@Column (name="FlowerName")
	private String name;
	
	private String color;
	private int price;

	public Flower() {
		
	}
	public Flower(String id, String name, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		 this.name = name;
	}
	public void setColor(String color) {
		 this.color = color;
	}
	public void setPrice(int price) {
		 this.price = price;
	}
	
	@Override
	public String toString() {
		return "Flower [FlowerID: " + this.id + 
				",\tFlowerName: " + this.name +
				",\tColor: " + this.color +
				",\tPrice: " + this.price + "]";
	}

}
