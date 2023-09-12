package com.manytomany.main;

import com.manytomany.pojo.*;

import org.hibernate.Session;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubjectPojo sp = new SubjectPojo();
		StudentPojo st = new StudentPojo();
		
		
		SubjectPojo sp1 = new SubjectPojo("Science");
		SubjectPojo sp2 = new SubjectPojo("Maths");
		SubjectPojo sp3 = new SubjectPojo("English");
		
		
		StudentPojo st1 = new StudentPojo("Nithish","vec");
		StudentPojo st2 = new StudentPojo("Sam","sec");
		
		//Student 1 have three subjects
		st1.getSubjects().add(sp1);
		st1.getSubjects().add(sp2);
		st1.getSubjects().add(sp3);
		
		//Student 2 have 2 subjects
		st2.getSubjects().add(sp1);
		st2.getSubjects().add(sp2);
		
		
		Session s =  HibernateUtil.getSessionFactory().openSession();
		
		s.beginTransaction();
		
		s.persist(st1);
		s.persist(st2);
		
		s.getTransaction().commit();
		s.close();
		
	}

}
