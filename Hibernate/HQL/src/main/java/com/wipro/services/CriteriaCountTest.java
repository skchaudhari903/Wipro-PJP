package com.wipro.services;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car;

public class CriteriaCountTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(
				"hibernate.car.cfg.xml"
		);
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		String reg = "KL-07";
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Car> cr = cb.createQuery(Car.class);
		Root<Car> root = cr.from(Car.class);
		cr.select(root);
		Predicate p = cb.equal(root.get("regNo"), reg);
		cr.where(p);
		Query<Car> query = session.createQuery(cr);
		List<Car> cl = query.list();
		
		transaction.commit();
		System.out.println("Record(s) with Reg No.: " + reg + " is " + cl.size());
		
		session.close();
		sc.close();
	}

}
