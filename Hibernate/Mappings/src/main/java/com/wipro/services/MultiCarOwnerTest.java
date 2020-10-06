package com.wipro.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;
import com.wipro.bean.MultiCarOwner;

public class MultiCarOwnerTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.multiowner.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		CarDetails cobj1 = new CarDetails("KL-07","AB 123 Polo","White","Volkswagon");
		CarDetails cobj2 = new CarDetails("KL-08","AB 234 Vento","Black","Volkswagon");
		CarDetails cobj3 = new CarDetails("KL-09","AC 345 Corolla","Silver","Toyota");
		
		List<CarDetails> cl = new ArrayList<CarDetails>();
		cl.add(cobj1);
		cl.add(cobj2);
		cl.add(cobj3);
		
		MultiCarOwner owner = new MultiCarOwner("ABC", cl);
		
		session.save(cobj1);
		session.save(cobj2);
		session.save(cobj3);
		session.save(owner);
		
		transaction.commit();
		
		System.out.println("Record Inserted: ");
		System.out.println(owner);
		
		session.close();
	}

}
