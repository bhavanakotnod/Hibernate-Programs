package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employeee;
import com.entity.Company;
public class FetchData {
	
	    public static void main(String[] args) {
	        Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
	                .addAnnotatedClass(Employeee.class)
	                .addAnnotatedClass(Company.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session ss = sf.openSession();

	        // Fetch all employees
	        List<Employeee> employees = ss.createQuery("FROM Employeee", Employeee.class).list();

	        for (Employeee emp : employees) {
	            System.out.println("Employee ID: " + emp.getEmp_id() +
	                               ", Name: " + emp.getEmp_name() +
	                               ", Department: " + emp.getcomp().getComp_name());
	        }

	        ss.close();
	        sf.close();
	    }
	}



