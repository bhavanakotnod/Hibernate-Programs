package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Employeee;
import com.entity.Company;


public class UpdataData {
	
	    public static void main(String[] args) {
	        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	                cfg.addAnnotatedClass(Employeee.class);
	                cfg.addAnnotatedClass(Company.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session ss = sf.openSession();
	        Transaction tr = ss.beginTransaction();

	        // Fetch employee by ID
	        Employeee emp = ss.get(Employeee.class, 1001);
	        if (emp != null) {
	            emp.setEmp_name("Sanika Patil"); // Update name
	            ss.update(emp);
	        } else {
	            System.out.println("Employee not found!");
	        }

	        tr.commit();
	        ss.close();
	        sf.close();
	        System.out.println("Record updated...");
	    }
	}



