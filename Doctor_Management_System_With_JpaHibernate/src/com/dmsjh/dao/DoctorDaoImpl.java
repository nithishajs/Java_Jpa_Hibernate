package com.dmsjh.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dmsjh.main.HibernateUtill;
import com.dmsjh.model.Doctor;

public class DoctorDaoImpl implements DoctorDao {
	
	private SessionFactory sf = HibernateUtill.getSessionFactory();

	//SAVE DOCTOR
	@SuppressWarnings("null")
	@Override
	public void saveDoctor(Doctor d) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;
		
		try(Session s = sf.openSession()){
			
			transaction = s.beginTransaction();
			s.save(d);
			transaction.commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			if(transaction == null) {
				transaction.rollback();
			}
		}
		
	}

	//LIST DOCTOR
	@SuppressWarnings({ "null", "unchecked" })
	@Override
	public List<Doctor> listDoctor() {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		List <Doctor> d = null;
		
		try(Session s = sf.openSession()){
			
			transaction = s.beginTransaction();
			d=s.createQuery("from Doctor").list();
			transaction.commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			if(transaction == null) {
				transaction.rollback();
			}
		}
		
		return d;
	}

	//LIST DOCTOR BY ID
	@SuppressWarnings("null")
	@Override
	public Doctor listById(int id) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		Doctor d = null;
		
		try(Session s = sf.openSession()){
			
			transaction = s.beginTransaction();
			d=s.get(Doctor.class, id);
			transaction.commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			if(transaction == null) {
				transaction.rollback();
			}
		}
		
		
		return d;
	}

	//UPDATE DOCTOR
	@SuppressWarnings("null")
	@Override
	public void updateDoctor(Doctor d) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;
		
		try(Session s = sf.openSession()){
			
			transaction = s.beginTransaction();
			s.saveOrUpdate(d);
			transaction.commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			if(transaction == null) {
				transaction.rollback();
			}
		}
		
	}

	
	//DELETE DOCTOR
	@SuppressWarnings("null")
	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;
		Doctor d = null;
		
		try(Session s = sf.openSession()){
			
			transaction = s.beginTransaction();
		    d=s.get(Doctor.class, id);
		    s.delete(d);
			transaction.commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			if(transaction == null) {
				transaction.rollback();
			}
		}
		
	}

}
