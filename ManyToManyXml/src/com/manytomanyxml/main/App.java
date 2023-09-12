package com.manytomanyxml.main;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.manytomanyxml.pojo.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using constructor
		TaskPojo tp =new TaskPojo();
		TaskPojo tp1 =new TaskPojo("Do delete");
		TaskPojo tp2 =new TaskPojo("Do update");
		
		EmployeePojo ep = new EmployeePojo();
		EmployeePojo ep1 = new EmployeePojo("Nithish","IT");
		EmployeePojo ep2 = new EmployeePojo("Ram","Ux");
		
		
		
		ep1.getTask().add(tp2);
		ep2.getTask().add(tp1);
		
		//using getter setter
     	//tp.setTaskname("do delete");
		
		//ep.setEname("ram");
		//ep.setEdep("it");
		
		//ep1.setEname("nithish");
		//ep1.setEdep("ux");
		
//		Set<TaskPojo> ts = new HashSet<TaskPojo>();
//		ts.add(tp1);
//		ts.add(tp2);
//		ep.setTask(ts);
//		
//		Set<EmployeePojo> es = new HashSet<EmployeePojo>();
//		es.add(ep1);
//		es.add(ep2);
//		tp.setEmployee(es);
		
		
		Session s =  HibernateUtil.getSessionFactory().openSession();
		
		s.beginTransaction();
		
//		Query q=s.createQuery("select from ep");  
//		List  list=q.list();  
//		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		
		
//		s.persist(tp1);
//		s.persist(tp2);
		s.persist(ep1);
		s.persist(ep2);
		
		s.getTransaction().commit();
		s.close();
		
		
		

	}

}
