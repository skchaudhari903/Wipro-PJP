package com.wipro.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car;

public class SelectWhereLikeTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.car.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query<Car> query = session.createQuery("From Car car Where car.manuf Like 'V%'", Car.class);
		List<Car> cl = query.list();
		
		transaction.commit();
		System.out.println("Record retrieved:");
		for(Car c : cl) {
			System.out.println(c);
		}
		
		session.close();
	}

}
