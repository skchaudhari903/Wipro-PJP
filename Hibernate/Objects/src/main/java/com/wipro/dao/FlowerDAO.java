package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class FlowerDAO {

	SessionFactory sessionFactory;

	public FlowerDAO() {
		Configuration cfg = new Configuration().configure(
				"hibernate.flower.cfg.xml"
		);
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public String insertFlower(Flower flower) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(flower);
		transaction.commit();
		session.close();
		return "Insert Successful";
	}
	
	public String updateFlower(Flower flower) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(flower);
		transaction.commit();
		session.close();
		return "Update Successful";
	}
	
	public String deleteFlower(String id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Flower flobj = session.get(Flower.class, id);
		if(flobj == null) return "Flower With Id : " + id + " Not Found.";
		session.delete(flobj);
		transaction.commit();
		session.close();
		return "Delete Successful";
	}
	
	public Flower getFlower(String id) {
		Session session = sessionFactory.openSession();
		Flower flobj = new Flower();
		flobj = session.get(Flower.class, id);
		session.close();
		return flobj;
	}
	
	public Flower loadFlower(String id) {
		Session session = sessionFactory.openSession();
		Flower flobj = new Flower();
		flobj = session.load(Flower.class, id);
		session.close();
		return flobj;
	}


}
