package com.onetomany;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {
	
	private static final SessionFactory sessionFactory;
	
	static {
		
		try {
		       
        	sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
        	
        } catch (Throwable th) {
    
            System.err.println("Initial SessionFactory creation failed." + th);
            throw new ExceptionInInitializerError(th);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
