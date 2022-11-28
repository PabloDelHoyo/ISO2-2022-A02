package org.teamA02.iso.domain;

public class Bussiness {
	private String name;
	private int nif;
	private String address;
	private String ownerName;
	
	public Bussiness(String name, int nif, String address, String ownerName) {
		this.name = name;
		this.nif = nif;
		this.address = address;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public int getNif() {
		return nif;
	}

	public String getAddress() {
		return address;
	}

	public String getOwnerName() {
		return ownerName;
	}
}
