package com.dmsjh.dao;

import java.util.List;

import com.dmsjh.model.Doctor;

interface DoctorDao {
	
	public void saveDoctor(Doctor d);
	
	public List<Doctor> listDoctor();
	
	public Doctor listById(int id);
	
	public void updateDoctor(Doctor d);
	
	public void deleteDoctor(int id);

}
