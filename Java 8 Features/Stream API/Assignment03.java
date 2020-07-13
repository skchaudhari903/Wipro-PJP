/*Create a Student class with
1. Instance variables: rollNo, name, mark.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Student objects into and ArrayList,
2. Filter the Student objects who have cleared the test with minimum 50 marks,
3. Get the count of how many have cleared and print it.
*/

import java.util.ArrayList;

class Student {
	private int rollNo;
	private String name;
	private float mark;
	
	Student(int rollNo, String name, float mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	
	float getMark() {
		return mark;
	}
}

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101, "Sachin", 85));
		list.add(new Student(102, "Kohli", 80));
		list.add(new Student(103, "Dhoni", 40));
		list.add(new Student(104, "Raina", 95));
		list.add(new Student(105, "Rahul", 49));
		long count = list.stream().filter(s -> s.getMark() >= 50).count();
		System.out.println(count);
	}

}
