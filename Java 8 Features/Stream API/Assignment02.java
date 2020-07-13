/*Create an Employee class with
1. Instance variables: empNo, name, age, location.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Employee objects into an ArrayList,
2. Filter the Employee objects whose location is Pune,
3. Store them in a separate ArrayList and print their details.
*/

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee {
	private int empNo;
	private String name;
	private int age;
	private String location;
	
	Employee(int empNo,String name, int age, String location) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	String getLocation() {
		return location;
	}
	
	public String toString(){
		return "Employee No: "+empNo+" name = "+name+" age = "+age+" location = "+location;
	}
}

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Sachin",35,"Pune"));
		list.add(new Employee(102, "Kohli", 40, "Delhi"));
		list.add(new Employee(103, "Dhoni", 30, "Ranchi"));
		list.add(new Employee(104, "Raina", 25, "Patna"));
		list.add(new Employee(105, "Rahul", 29, "Pune"));
		
		ArrayList res = (ArrayList) list.stream().filter(e -> e.getLocation().equalsIgnoreCase("Pune")).collect(Collectors.toList());
		res.forEach(emp -> System.out.println(emp));
	}

}
