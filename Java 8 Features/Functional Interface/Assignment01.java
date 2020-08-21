/*Given an ArrayList with 5 Employee(id,name,location,salary) objects,
write a program to extract the location details of each Employee and store it in an ArrayList, with the help of Function.
*/

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
	private int empNo;
	private String name;
	private int age;
	private String location;
	
	Employee(int empNo,String name,int age,String location){
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.location=location;
	}
	String getLocation(){
		return location;
	}
	public String toString(){
		return "Employee No: "+empNo+" name="+name+" age="+age+" location="+location;
	}
	
}

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Sachin", 35, "Jaipur"));
		list.add(new Employee(102, "Kohli", 40, "Pune"));
		list.add(new Employee(103, "Dhoni", 30, "Ranchi"));
		list.add(new Employee(104, "Raina", 25, "Kanpur"));
		list.add(new Employee(105, "Rahul", 29, "Lucknow"));
		
		Function<ArrayList<Employee>, ArrayList<String>> func = ( all )-> {
			ArrayList<String> locations = new ArrayList<>();
			for(Employee e : all){
				locations.add(e.getLocation());
			}
			return locations;
		};
		
		System.out.println(func.apply(list));
	}

}
