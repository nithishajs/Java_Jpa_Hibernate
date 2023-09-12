package com.manytomany.pojo;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SubjectPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sbId;
	
	private String subName;
	
	@ManyToMany(mappedBy="subjects")
	private Set<StudentPojo> student = new HashSet <StudentPojo>();

	public int getSbId() {
		return sbId;
	}

	public void setSbId(int sbId) {
		this.sbId = sbId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Set<StudentPojo> getStudent() {
		return student;
	}

	public void setStudent(Set<StudentPojo> student) {
		this.student = student;
	}

	public SubjectPojo(String subName) {
		super();
		this.subName = subName;
		
	}

	public SubjectPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
