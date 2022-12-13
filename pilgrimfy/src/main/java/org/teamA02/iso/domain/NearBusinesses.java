package org.teamA02.iso.domain;

public class NearBusinesses {
	private Location userLocation;
	private Boolean acceptedTerms;
	private Bussiness[] nearBusinesses;
	public NearBusinesses(Location userLocation, Boolean acceptedTerms, Bussiness[] nearBusinesses) {
		super();
		this.userLocation = userLocation;
		this.acceptedTerms = acceptedTerms;
		this.nearBusinesses = nearBusinesses;
	}
	public Location getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(Location userLocation) {
		this.userLocation = userLocation;
	}
	public Boolean getAcceptedTerms() {
		return acceptedTerms;
	}
	public void setAcceptedTerms(Boolean acceptedTerms) {
		this.acceptedTerms = acceptedTerms;
	}
	public Bussiness[] getNearBusinesses() {
		return nearBusinesses;
	}
	public void setNearBusinesses(Bussiness[] nearBusinesses) {
		this.nearBusinesses = nearBusinesses;
	}
	public void SearchNearBusinesses() {
		
	}
}
