package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;

public class CarTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.car.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Car cobj1 = new Car("KL-07","AB 123 Polo","White","Volkswagon");
		Car cobj2 = new Car("KL-08","AB 234 Vento","Black","Volkswagon");
		Car cobj3 = new Car("KL-09","AC 345 Corolla","Silver","Toyota");
		
		session.save(cobj1);
		session.save(cobj2);
		session.save(cobj3);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(cobj1);
		System.out.println(cobj2);
		System.out.println(cobj3);
		session.close();
	}

}
