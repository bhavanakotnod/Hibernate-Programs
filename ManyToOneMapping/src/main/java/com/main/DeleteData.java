package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employeee;
import com.entity.Company;

public class DeleteData {
	
	    public static void main(String[] args) {
	        Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
	                .addAnnotatedClass(Employeee.class)
	                .addAnnotatedClass(Company.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session ss = sf.openSession();
	        Transaction tr = ss.beginTransaction();

	        // Fetch employee by ID
	        Employeee emp = ss.get(Employeee.class, 1003);
	        if (emp != null) {
	            ss.delete(emp); // Delete employee
	        } else {
	            System.out.println("Employee not found!");
	        }

	        tr.commit();
	        ss.close();
	        sf.close();
	        System.out.println("Data deleted...");
	    }
	}



