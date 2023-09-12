package com.onetoone.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetoone.pojo.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeePojo emp = new EmployeePojo();
    	AddressPojo add = new AddressPojo();
    	
    	add.setCity("Thiruvarur");
    	
    	
    	emp.setEmpName("Nithish");
    	emp.setEmpAge(21);
    	emp.setAddress(add);
    	
    	SessionFactory sf = HibernateUtill.getSessionFactory();
    	Session s = sf.getCurrentSession();
    	
    	s.beginTransaction();
    	s.save(emp);
    	s.save(add);
    	
    	s.getTransaction().commit();
    	s.close();
    }
}
