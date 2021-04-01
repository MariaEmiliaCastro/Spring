package com.luv2code.practiceactivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.practiceactivity.Employee;

public class CreateEmployee {

	public void CriaEmployee() {

		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Employee.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// use the session object to save Java object
			System.out.println("Creating new Employee object...");
			Employee tempEmployee = new Employee("Paul", "Noku", "paul@luv2code.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the Employee object
			System.out.println("Saving the Employee...");
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}

}
