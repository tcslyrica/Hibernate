package com.hibernate1;

import org.hibernate.Session;


public class TestHibernate {
	public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("Lyrica@mail.com");
        emp.setFirstName("Lyrica");
        emp.setLastName("Dodati");
         
         
        session.save(emp);
         
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
}

