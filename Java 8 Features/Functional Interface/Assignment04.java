/*Create an Employee class with three private variables id, name and salary.
Create getters & setters and a parameterized constructor.

Create an ArrayList and store 5 to 10 Employee objects in it. 
Write a program using Predicate, to filter and display the name of the employees whose salary is less than 10000.
 */

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	private int id;
	private String name;
	private double salary;
	Employee(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
}

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101,"Sachin",20000));
		list.add(new Employee(102,"Kohli",5000));
		list.add(new Employee(103,"Dhoni",58000));
		list.add(new Employee(104,"Raina",97000));
		list.add(new Employee(105,"Rahul",40000));
		list.add(new Employee(104,"Rohit",9800));
		list.add(new Employee(105,"Mohit",9000));
		
		Predicate<Double> p = i -> i < 10000;
		ArrayList<String> res = new ArrayList<>();
		list.forEach(
		i -> {
			if(p.test(i.getSalary()))res.add(i.getName());
			}
		);
		System.out.println(res);
	}

}
