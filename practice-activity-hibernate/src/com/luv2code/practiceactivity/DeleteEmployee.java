package com.luv2code.practiceactivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.practiceactivity.Employee;

public class DeleteEmployee {

	public void DeletaEmployee() {

		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Employee.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			int EmployeeId = 1;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve Employee based on the id: primary key
			System.out.println("\nGetting Employee with id: " + EmployeeId);
			
			Employee myEmployee = session.get(Employee.class, EmployeeId);
			
			// delete the Employee
			System.out.println("Deleting Employee" + myEmployee);
			session.delete(myEmployee);
			
			// commit the transaction
			session.getTransaction().commit();
			
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}

}
