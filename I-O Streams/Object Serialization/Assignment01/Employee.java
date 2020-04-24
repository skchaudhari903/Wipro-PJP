/*Create a class called Employee with properties name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).

Create respective getter and setter methods and constructors (no-argument constructor and parameterized constructor) for the same.

Create an object of the Employee class and save this object in a file called "data" using serialization.
Later using deserialization read this object and print the properties of this object.
*/

package ObjectSerialization.Assignment01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
	private String name;
	private String dob;
	private String department;
	private String designation;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(scan.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(scan.nextLine());
		System.out.print("Enter department: ");
		emp.setDepartment(scan.nextLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(scan.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(scan.nextDouble());
		scan.nextLine();
		
		FileOutputStream fos = new FileOutputStream("data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
	}

}
