package org.teamA02.iso.domain;

public class Bussiness {
	private String name;
	private int nif;
	private String address;
	private String ownerName;
	private Location businessLocation;
	private String businessType;

	private float rating;

	public Bussiness(String name, int nif, String address, String ownerName, float rating, Location businessLocation, String businessType) {
		this.name = name;
		this.nif = nif;
		this.address = address;
		this.ownerName = ownerName;
		this.rating = rating;
		this.businessLocation = businessLocation;
		this.businessType = businessType;
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

	public Location getBusinessLocation() {
		return businessLocation;
	}

	public void setBusinessLocation(Location businessLocation) {
		this.businessLocation = businessLocation;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
}
