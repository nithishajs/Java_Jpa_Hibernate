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
@Table(name="address")
public class AddressPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aId;
	
	@Column(name="city", nullable=false)
	private String city;
	
	
//for bidirectional
//		@OneToOne(mappedBy="address")
//		private EmployeePojo employee;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	


}
