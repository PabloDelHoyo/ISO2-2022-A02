package org.teamA02.iso.domain;

public class Bussiness {
	private String name;
	private int nif;
	private String address;
	private String ownerName;

	private float rating;

	public Bussiness(String name, int nif, String address, String ownerName, float rating) {
		this.name = name;
		this.nif = nif;
		this.address = address;
		this.ownerName = ownerName;
		this.rating = rating;
	}

	public void addRating(float rating) {
		this.rating = rating;
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

	public float getRating() {
		return rating;
	}
}
