package com.wipro.bean;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@Entity
public class Continent {
	
	@Id
	private String cname;
	
	@ElementCollection
	@MapKeyColumn(name = "Country")
    @Column(name="Capital")
    @CollectionTable(name="Country_Details")
	private Map<String, String> countries;
	
	public Continent() {
		
	}
	public Continent(String cname, Map<String, String> countries) {
		super();
		this.cname = cname;
		this.countries = countries;
	}
	
	public void setContinentName(String cname) {
		this.cname = cname;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	
	public String getContinentName() {
		return this.cname;
	}
	public Map<String, String> getCountries() {
		return this.countries;
	}
	
	@Override
	public String toString() {
		String out = "Continent [Name: " + this.cname + 
				",\tCountries: [";
		
		for(String country: this.countries.keySet()) {
			out += "Country [Name: " + country +
					"\tCapital: " + this.countries.get(country) +
					"]";
		}
		
		out += "]]";
		
		return out;
	}

}
