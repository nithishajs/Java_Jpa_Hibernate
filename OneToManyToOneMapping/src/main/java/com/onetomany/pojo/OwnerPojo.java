package com.onetomany.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class OwnerPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int oid;
	
	@Column(name="oname")
	private String owerName;
	
	@OneToMany(mappedBy="owner")
	private Set<VechiclePojo> vechicles;

	public Set<VechiclePojo> getVechicles() {
		return vechicles;
	}

	public void setVechicles(Set<VechiclePojo> vechicles) {
		this.vechicles = vechicles;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}
	
	

}
