package com.onetoonexml.pojo;

public class ParentPojo {
	
	private int pid;
	private String fname;
	private String mname;
	private StudentPojo student;
	
	
	public StudentPojo getStudent() {
		return student;
	}
	public void setStudent(StudentPojo student) {
		this.student = student;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
	public ParentPojo(String fname, String mname, StudentPojo student) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.student = student;
	}
	public ParentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
