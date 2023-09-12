package com.onetomanyxml.main;


import com.onetomanyxml.pojo.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SectionPojo sp = new SectionPojo();
		
		sp.setSecName("A");
		
		//using constructor
//		StudentPojo st = new StudentPojo("Nithish","12th",sp); 
		
		StudentPojo st = new StudentPojo(); 
		//using getter setter
		st.setSname("Nithish");
		st.setSclass("12th");
		st.setSection(sp);
		
		StudentPojo st1 = new StudentPojo(); 
		//using getter setter
		st1.setSname("Ram");
		st1.setSclass("12th");
		st1.setSection(sp);
		
		Set <StudentPojo> student = new HashSet<StudentPojo>();
		student.add(st);
		student.add(st1);
		
		sp.setStudent(student);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		s.save(sp);
		s.save(st);
		s.save(st1);

		
		s.getTransaction().commit();
		s.close();

	}

}
