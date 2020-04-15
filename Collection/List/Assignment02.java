/*1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int empId;
	private String empName, email, gender;
	private float salary;
	
	Employee(int empId, String empName, String empEmail, String empGender, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		email = empEmail;
		gender = empGender;
		salary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public float getSalary() {
		return salary;
	}

	void GetEmployeeDetails() {
		System.out.println("Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpEmail=" + email 
				+ ", EmpGender=" + gender + ", EmpSalary=" + salary + "]");
	}
}

class EmployeeDB {
	List<Employee> employeeDb = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getSalary();
			}
		}
		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
}

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Bob", "bob@gmail.com", "Male", 25000);
		Employee emp2 = new Employee(102, "Alice", "alice@rediffmail.com", "Female", 30000);
		Employee emp3 = new Employee(103, "John", "john@ymail.com", "Male", 20000);
		Employee emp4 = new Employee(104, "Anthony", "anthony@outlook.com", "Male", 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}
