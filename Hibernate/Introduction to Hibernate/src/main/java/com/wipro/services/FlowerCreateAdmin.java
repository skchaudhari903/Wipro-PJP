package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class FlowerCreateAdmin {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.flower.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Flower flobj1 = new Flower("INDICA01","Indica Blue","Blue",48);
		Flower flobj2 = new Flower("INDICA02","Indica Violet","Violet",56);
		Flower flobj3 = new Flower("INDICA03","Indica Red","Red",34);
		Flower flobj4 = new Flower("ROSE01","Rose Yellow","Yellow",87);
		Flower flobj5 = new Flower("ROSE02","Rose Red","Red",98);
		session.save(flobj1);
		session.save(flobj2);
		session.save(flobj3);
		session.save(flobj4);
		session.save(flobj5);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(flobj1);
		System.out.println(flobj2);
		System.out.println(flobj3);
		System.out.println(flobj4);
		System.out.println(flobj5);
		session.close();
	}
}
