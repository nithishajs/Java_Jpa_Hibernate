package com.manytomanyxml.pojo;
import java.util.HashSet;
import java.util.Set;

public class EmployeePojo {
	
	private int eid;
	private String ename;
	private String edep;
	private Set<TaskPojo> task =  new HashSet<TaskPojo>();
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdep() {
		return edep;
	}
	public void setEdep(String edep) {
		this.edep = edep;
	}
	public Set<TaskPojo> getTask() {
		return task;
	}
	public void setTask(Set<TaskPojo> task) {
		this.task = task;
	}
	public EmployeePojo(String ename, String edep) {
		super();
		this.ename = ename;
		this.edep = edep;
		
	}
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
