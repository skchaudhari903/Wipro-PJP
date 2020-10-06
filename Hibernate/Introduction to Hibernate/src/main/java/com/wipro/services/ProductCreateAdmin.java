package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Product;

public class ProductCreateAdmin {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.product.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Product probj1 = new Product("Pomfret 1kg", 120);
		Product probj2 = new Product("Mutton 1kg", 400);
		Product probj3 = new Product("Weikfield Tomato Sauce", 85);
		Product probj4 = new Product("Nestle Maggi", 12);
		Product probj5 = new Product("Colgate Max Fresh", 100);
		session.save(probj1);
		session.save(probj2);
		session.save(probj3);
		session.save(probj4);
		session.save(probj5);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(probj1);
		System.out.println(probj2);
		System.out.println(probj3);
		System.out.println(probj4);
		System.out.println(probj5);
		session.close();
	}
}
