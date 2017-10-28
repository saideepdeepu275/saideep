package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Supplier 
{
	@Id
	@GeneratedValue
	
	int supId;
	
	String supName,supDesc, supAddress;

	public int getsupId() {
		return supId;
	}

	public void setsupId(int supId) {
		this.supId = supId;
	}

	public String getsupName() {
		return supName;
	}

	public void setsupName(String supName) {
		this.supName = supName;
	}

	public String getsupDesc() {
		return supDesc;
	}

	public void setsupDesc(String supDesc) {
		this.supDesc = supDesc;
	}

	public String getsupAddress() {
		return supAddress;
	}

	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}
}