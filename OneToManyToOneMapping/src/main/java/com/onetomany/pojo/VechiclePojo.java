package com.onetomany.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vechicles")
public class VechiclePojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vid;
	
	@Column(name="vname")
	private String vname;
	
	@Column(name="vtype")
	private String vtype;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_oid")
	private OwnerPojo owner;
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public VechiclePojo( String vname, String vtype, OwnerPojo owner) {
		super();
//		this.vid = vid;
		this.vname = vname;
		this.vtype = vtype;
		this.owner = owner;
	}

	public OwnerPojo getOwner() {
		return owner;
	}

	public void setOwner(OwnerPojo owner) {
		this.owner = owner;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVtype() {
		return vtype;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	

	public VechiclePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
