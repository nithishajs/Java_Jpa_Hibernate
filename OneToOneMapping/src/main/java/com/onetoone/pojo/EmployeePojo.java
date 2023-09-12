package com.onetoone.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeePojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emplId;
	
	@Column(name="ename", nullable=false)
	private String empName;
	
	@Column(name="eage", nullable=false)
	private int empAge;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_aid")
	private AddressPojo address;

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public AddressPojo getAddress() {
		return address;
	}

	public void setAddress(AddressPojo address) {
		this.address = address;
	}
	
	
	
	

}
