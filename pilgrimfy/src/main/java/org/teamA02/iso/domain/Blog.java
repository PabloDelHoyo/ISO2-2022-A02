package org.teamA02.iso.domain;

public class Blog {
	String owner;
	Photos[] gallery;
	String routeName;
	public Blog(String owner, Photos[] gallery, String routeName) {
		super();
		this.owner = owner;
		this.gallery = gallery;
		this.routeName = routeName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Photos[] getGallery() {
		return gallery;
	}
	public void setGallery(Photos[] gallery) {
		this.gallery = gallery;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public void AddPhoto(Photos[] gallery) {
		this.gallery = gallery;
	}
	public void DeletePhoto(Photos[] gallery) {
		this.gallery = gallery;
	}
	public void AddEntry(Photos[] gallery) {
		this.gallery = gallery;
	}
	public void DeleteEntry(Photos[] gallery) {
		this.gallery = gallery;
	}
}
