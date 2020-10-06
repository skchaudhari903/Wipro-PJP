package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;

public class EmployeeCreateAdmin {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.employee.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employee empobj1 = new Employee("John Smith", "Analyst", 1000);
		Employee empobj2 = new Employee("Agent 47", "CFO", 100000);
		Employee empobj3 = new Employee("Katia van Dees", "CEO", 900000);
		Employee empobj4 = new Employee("Thomas Cat", "Chief Animator", 10000);
		Employee empobj5 = new Employee("Jerry Mouse", "Chief Animator", 10000);
		session.save(empobj1);
		session.save(empobj2);
		session.save(empobj3);
		session.save(empobj4);
		session.save(empobj5);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(empobj1);
		System.out.println(empobj2);
		System.out.println(empobj3);
		System.out.println(empobj4);
		System.out.println(empobj5);
		session.close();
	}
}
