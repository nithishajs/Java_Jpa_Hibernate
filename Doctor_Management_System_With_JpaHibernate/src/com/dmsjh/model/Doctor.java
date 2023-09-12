package com.dmsjh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String dName;
	
	
	private String qualification;
	
	
	private String specalization;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getSpecalization() {
		return specalization;
	}


	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}


	public Doctor(String dName, String qualification, String specalization) {
		super();
		this.dName = dName;
		this.qualification = qualification;
		this.specalization = specalization;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
