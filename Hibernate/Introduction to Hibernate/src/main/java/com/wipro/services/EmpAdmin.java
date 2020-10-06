package com.wipro.services;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Emp;

public class EmpAdmin {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Emp empobj = new Emp(
				8000,
				"Jack Li",
				"Analyst",
				7566,
				Date.valueOf("2020-08-12"),
				25000,
				500,
				10);
		session.save(empobj);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(empobj);
		session.close();
	}
}
