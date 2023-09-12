package com.manytomanyxml.pojo;

import java.util.HashSet;
import java.util.Set;

public class TaskPojo {
	
	private int tid;
	private String taskname;
	private Set<EmployeePojo> employee = new HashSet<EmployeePojo>();
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public Set<EmployeePojo> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<EmployeePojo> employee) {
		this.employee = employee;
	}
	public TaskPojo(String taskname) {
		super();
		this.taskname = taskname;
		
	}
	public TaskPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
