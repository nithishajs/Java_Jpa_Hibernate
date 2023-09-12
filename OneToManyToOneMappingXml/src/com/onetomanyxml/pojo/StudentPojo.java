package com.onetomanyxml.pojo;

public class StudentPojo {
	
	private int sId;
	private String sname;
	private String sclass;
	private SectionPojo section;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
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
	public SectionPojo getSection() {
		return section;
	}
	public void setSection(SectionPojo section) {
		this.section = section;
	}
	public StudentPojo(String sname, String sclass, SectionPojo section) {
		super();
		this.sname = sname;
		this.sclass = sclass;
		this.section = section;
	}
	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
