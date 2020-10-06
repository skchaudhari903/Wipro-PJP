package com.wipro.services;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Continent;

public class ContinentTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.continent.create.cfg.xml"
		);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Map<String,String> c = new HashMap<String,String>();
		c.put("India", "New Delhi");
		c.put("Nepal", "Kathmandu");
		c.put("China", "Beijing");
		c.put("Sri Lanka", "Colombo");
		c.put("Bangladesh", "Dhaka");
		c.put("Maldives", "Male");
		c.put("Singapore", "Singapore");
		c.put("Myanmar", "Naypyidaw");
		c.put("Indonesia", "Jakarta");
		c.put("Japan", "Tokyo");
		
		Continent asia = new Continent("Asia",c);
		
		session.save(asia);
		
		transaction.commit();
		
		System.out.println("Record Inserted: ");
		System.out.println(asia);
		
		session.close();
	}

}
