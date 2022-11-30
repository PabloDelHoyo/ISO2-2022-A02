package org.teamA02.iso.domain;

import java.util.Date;

public class Pilgrim {
	String name;
	Date birthDate;
	boolean allowsOffers;

	public Pilgrim(String name, Date birthDate, boolean allowsOffers) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.allowsOffers = allowsOffers;
	}

	public String getName() {
		return name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public boolean allowsOffers() {
		return allowsOffers;
	}
	
	
	
	
}
