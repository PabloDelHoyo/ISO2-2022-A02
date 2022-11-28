package org.teamA02.iso.domain;

import java.util.Date;

public class BussinessOwner {
	
	String name;
	Date birthDate;
	boolean hasPaidFee;

	public BussinessOwner(String name, Date birthDate, boolean hasPaidFee) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.hasPaidFee = hasPaidFee;
	}
	
	
	public String getName() {
		return name;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public boolean HasPaidFee() {
		return hasPaidFee;
	}
	
}
