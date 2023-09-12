package com.onetoonexml.pojo;

public class StudentPojo {
	
	private int sid;
	private String sname;
	private String sclass;
	private ParentPojo parent;
	
	
	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StudentPojo(String sname, String sclass, ParentPojo parent) {
		super();
		this.sname = sname;
		this.sclass = sclass;
		this.parent = parent;
	}



	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}



	public ParentPojo getParent() {
		return parent;
	}



	public void setParent(ParentPojo parent) {
		this.parent = parent;
	}
	
	

}
