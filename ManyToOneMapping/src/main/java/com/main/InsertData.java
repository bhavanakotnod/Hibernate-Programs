package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Company;
import com.entity.Employeee;


public class InsertData {
	public static void main(String[] args) {
		

				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Employeee.class);
				cfg.addAnnotatedClass(Company.class);

				SessionFactory sf = cfg.buildSessionFactory();
				Session ss = sf.openSession();
				Transaction tr = ss.beginTransaction();

				Company c = new Company();
				c.setComp_name("TCS");

				Employeee e1 = new Employeee();
				e1.setEmp_id(1001);
				e1.setEmp_name("sanika");
				e1.setcomp(c);

				Employeee e2 = new Employeee();
				e2.setEmp_id(1002);
				e2.setEmp_name("Anu");
				e2.setcomp(c);

				Employeee e3 = new Employeee();
				e3.setEmp_id(1003);
				e3.setEmp_name("gita");
				e3.setcomp(c);

				ArrayList list = new ArrayList();
				list.add(e1);
				list.add(e2);
				list.add(e3);

				ss.persist(c);
				ss.persist(e1);
				ss.persist(e2);
				ss.persist(e3);
				c.setEmp(list);

				tr.commit();
				ss.close();

				System.out.println("Data is inserted...");

			}

		}



