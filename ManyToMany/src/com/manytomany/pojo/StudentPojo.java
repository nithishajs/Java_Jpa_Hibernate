package com.manytomany.pojo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class StudentPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stId;
	private String sName;
	private String scollege;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Subjects",
	joinColumns=@JoinColumn(name="stId"),
	inverseJoinColumns=@JoinColumn(name="sbId"))
	private Set<SubjectPojo> subjects = new HashSet <SubjectPojo>(); 

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getScollege() {
		return scollege;
	}

	public void setScollege(String scollege) {
		this.scollege = scollege;
	}

	public Set<SubjectPojo> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<SubjectPojo> subjects) {
		this.subjects = subjects;
	}

	public StudentPojo(String sName, String scollege) {
		super();
		this.sName = sName;
		this.scollege = scollege;
		
	}

	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
