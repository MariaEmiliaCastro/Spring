package com.luv2code.practiceactivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.practiceactivity.Employee;

public class UpadateEmployee {

	public void AtualizaEmployee () {

		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Employee.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			int employeeId = 1;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve Employee based on the id: primary key
			System.out.println("\nGetting Employee with id: " + employeeId);
			
			Employee myEmployee = session.get(Employee.class, employeeId);
			
			System.out.println("Updating employee...");
			myEmployee.setFirstName("Scooby");
			
			// commit the transaction
			session.getTransaction().commit();
			
			// NEW CODE
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all Employees
			System.out.println("Update email for all Employees");
			
			session.createQuery("update Employee set company='Google'").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}

}
