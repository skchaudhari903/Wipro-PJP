package com.wipro.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Multi_Car_Owner")
public class MultiCarOwner {
	
	@Id
	@Column (name="OwnerID")
	private int id;
	@Column (name="OwnerName", length=30)
	private String name;
	
	@OneToMany (orphanRemoval=true)
	@JoinColumn (name="Owner_ID")
	private List<CarDetails> cars;

	public MultiCarOwner() {
		
	}
	
	public MultiCarOwner(String name, List<CarDetails> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	
	public MultiCarOwner(int id,String name, List<CarDetails> cars) {
		super();
		this.id = id;
		this.name = name;
		this.cars = cars;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public List<CarDetails> getCars() {
		return this.cars;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCars(List<CarDetails> cars) {
		this.cars = cars;
	}
	
	@Override
	public String toString() {
		String out = "CarOwner [ID: " + this.id + 
				",\tName: " + this.name;
		
		for(CarDetails c: this.cars) {
			out += ",\t" + c.toString();
		}
		
		out += "]";
		
		return out;
	}

}
