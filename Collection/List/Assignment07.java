/*Write a program that will have a Vector which is capable of storing Employee objects. 
Use an Iterator and enumeration to list all the elements of the Vector.
*/

import java.util.Iterator;
import java.util.Vector;

class EmployeeList {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public EmployeeList(int id, String name, String address, Double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<EmployeeList> list = new Vector<>();
		
		list.add(new EmployeeList(101, "Bob", "Pune", 20000.0));
		list.add(new EmployeeList(102, "Alice", "Mumbai", 30000.0));
		list.add(new EmployeeList(103, "John", "Bangalore", 25000.0));
		list.add(new EmployeeList(104, "Anthony", "Hyderabad", 40000.0));
		
		Iterator<EmployeeList> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}

}
