package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student1;

public class StudentDao {

	public void insertData(Student1 s) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student1.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Student(age,city,name,surname)values(:age,:city,:name,:surname)";
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("age", 24);
		query.setParameter("city", "ranchi");
		query.setParameter("name", "mahi");
		query.setParameter("surname", "rathe");
		query.executeUpdate();

		System.out.println("Data is inserted...");
		tr.commit();
		ss.close();
		
	}
	
}
