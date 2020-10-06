package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Address;
import com.wipro.bean.Emp;

public class EmpAddressTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.empadd.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Address add = new Address("A","B","C","D");
		
		Emp emp = new Emp("ABC", add);
		
		session.save(emp);
		transaction.commit();
		
		System.out.println("Record Inserted: ");
		System.out.println(emp);
		
		session.close();
	}

}
