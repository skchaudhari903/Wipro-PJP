package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;
import com.wipro.bean.Passport;

public class EmpPassportTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.emppass.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Passport pass = new Passport("1234567890");
		session.save(pass);
		
		Employee emp = new Employee("ABC", pass);
		
		session.save(emp);
		transaction.commit();
		
		System.out.println("Record Inserted: ");
		System.out.println(emp);
		
		session.close();
	}

}
