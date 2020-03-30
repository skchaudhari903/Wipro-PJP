package Inheritance.Assignment03;

class Person {
    String name;
    
    Person(String name) {
    	this.name = name;
    }
}

class Student extends Person {
	int studentId;
	
    Student(String name, int studentId) {
    	super(name);
    	this.studentId = studentId;
	}
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, String subject, double salary) {
    	super(name);
        this.subject = subject;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }

}

class CollegeStudent extends Student {
	String collegeName;
	String year;

    CollegeStudent(String name, int studentId, String year, String CollegeName) {
    	super(name, studentId);
        this.year = year;
        this.collegeName = CollegeName;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Student ID: " + studentId + ", Year: " + year + ", College: " + collegeName);
    }

}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("Rakesh Shirsath", "Data Structures", 50000);
        CollegeStudent collegeStudent = new CollegeStudent("Shubham", 112016410, "Forth", "Sandip Foundation's");
        
        teacher.display();
        collegeStudent.display();
	}

}
