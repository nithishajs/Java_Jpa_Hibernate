package com.hql.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@Entity
//@Table(name="doctors")

//@NamedQueries(
//		 {
//		 @NamedQuery(
//		 name = "findDoctorByname",
//		 query = "from Doctor d where d.name = :name"
//		 )
//		 }
//		) 
public class Doctor {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dId;
	private String name;
	private String specilaist;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecilaist() {
		return specilaist;
	}
	public void setSpecilaist(String specilaist) {
		this.specilaist = specilaist;
	}
	
	public Doctor(String name, String specilaist) {
		super();
		this.name = name;
		this.specilaist = specilaist;
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
