package com.onetoonexml.main;

import com.onetoonexml.pojo.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentPojo sp = new StudentPojo();
		
		sp.setSname("Nithish");
		sp.setSclass("12th");
		
		ParentPojo pp =  new ParentPojo();
		
		pp.setFname("Ram");
		pp.setMname("Janu");
		
		sp.setParent(pp);
		pp.setStudent(sp);
	
		//using constructor
//		ParentPojo pp =  new ParentPojo("ram","sam",sp);
//		
//		StudentPojo sp1 = new StudentPojo("Nithish","12th",pp);
		
		
		SessionFactory sf = HibernateUtil.getSessionFactoey();
		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		

		s.save(sp);
		
		
		s.getTransaction().commit();
		s.close();

	}

}
