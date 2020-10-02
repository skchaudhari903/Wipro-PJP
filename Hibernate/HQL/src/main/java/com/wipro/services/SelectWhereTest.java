package com.wipro.services;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car;

public class SelectWhereTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.car.cfg.xml"
		);
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.print("Enter Registration No > ");
		String reg = sc.next();
		
		Query<Car> query = session.createQuery("From Car car Where car.regNo = ?0", Car.class);
		query.setParameter(0, reg);
		List<Car> cl = query.list();
		
		transaction.commit();
		System.out.println("Record retrieved:");
		for(Car c : cl) {
			System.out.println(c);
		}
		
		session.close();
		sc.close();
	}

}
