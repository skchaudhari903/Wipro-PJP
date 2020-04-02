/*Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.
The other data members of the Employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/

package Inheritance.Assignment02;

public class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
