package org.teamA02.iso.domain;

public class Offer {
	private BussinessOwner issuer;
	private User receiver;
	public Offer(BussinessOwner issuer, User receiver) {
		super();
		this.issuer = issuer;
		this.receiver = receiver;
	}
	public BussinessOwner getIssuer() {
		return issuer;
	}
	public void setIssuer(BussinessOwner issuer) {
		this.issuer = issuer;
	}
	public User getReceiver() {
		return receiver;
	}
	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
	public void MakeOffer() {
		
	}
}
