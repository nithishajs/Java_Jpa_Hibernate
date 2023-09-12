package com.hql.main;

import com.hql.pojo.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.query.Query;
import javax.persistence.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d = new Doctor("Nithish","Cardio");
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		
//Using with Create Query method
		
//		Query q=s.createQuery("from Doctor");  
//		List  list=q.list();  
//		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			Doctor ds = (Doctor)itr.next();
//			
//			System.out.println(ds.getName()+" "+ds.getSpecilaist());
//		}
//		
//		Query q=s.createQuery("update Doctor set name=:n where id=:i");  
//		q.setParameter("n","Udit Kumar");  
//		q.setParameter("i",2);  
//		q.executeUpdate();
//		
		
		
		///Using named query and typed query
//		
		TypedQuery query = s.createNamedQuery("findDoctorByname");
		query.setParameter("name", "Udit Kumar");
		
		List  list=query.getResultList();  
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Doctor ds = (Doctor)itr.next();
			
			System.out.println(ds.getName()+" "+ds.getSpecilaist());
		}
		
//		s.save(d);
		s.getTransaction().commit();
		s.close();

	}

}
