package com.onetomany;

import com.onetomany.pojo.*;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OwnerPojo op = new OwnerPojo();
		
		op.setOwerName("sam");
		
		
		VechiclePojo vp1 = new VechiclePojo("virtus","Car",op);
		VechiclePojo vp2 = new VechiclePojo("suzuki","bike",op);
		VechiclePojo vp3 = new VechiclePojo("benz","Helicopter",op);
		
		Set<VechiclePojo> vehicle = new HashSet<>();
		vehicle.add(vp1);
		vehicle.add(vp2);
		vehicle.add(vp3);
		
		op.setVechicles(vehicle);
		
		SessionFactory sf = HibernateUtill.getSessionFactory();
		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		s.save(op);
		s.save(vp1);
		s.save(vp2);
		s.save(vp3);
		
		s.getTransaction().commit();
		s.close();
		
		
		

	}

}