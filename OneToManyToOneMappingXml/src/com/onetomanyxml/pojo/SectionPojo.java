package com.onetomanyxml.pojo;

import java.util.Set;

public class SectionPojo {
	
	private int secId;
	private String secName;
	private Set<StudentPojo> student;
	public int getSecId() {
		return secId;
	}
	public void setSecId(int secId) {
		this.secId = secId;
	}
	public String getSecName() {
		return secName;
	}
	public void setSecName(String secName) {
		this.secName = secName;
	}
	public Set<StudentPojo> getStudent() {
		return student;
	}
	public void setStudent(Set<StudentPojo> student) {
		this.student = student;
	}
	public SectionPojo(String secName, Set<StudentPojo> student) {
		super();
		this.secName = secName;
		this.student = student;
	}
	public SectionPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
