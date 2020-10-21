
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Override
	public String toString() {
		return "[Employee details: id=" + id + ",name=" + name + ",gender=" + gender + ",designation=" + designation
				+ ",salary=" + salary + ",city=" + city + ",email=" + email + ",mobile=" + mobile+"]";
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getMobile() {
		return mobile;
	}
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}
	@Column(name="gender")
	String gender;
	@Column(name="designation")
	String designation;
	@Column(name="salary")
	int salary;
	@Column(name="city")
	String city;
	@Column(name="email")
	String email;
	@Column(name="mobile")
	BigInteger mobile;
	
	
}
