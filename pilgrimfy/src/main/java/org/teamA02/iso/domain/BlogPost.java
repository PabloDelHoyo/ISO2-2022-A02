package org.teamA02.iso.domain;

import java.util.Date;

public class BlogPost {
	float rating;
	String comment;
	Date date;
	Pilgrim pilgrim;
	BussinessOwner owner;

	public BlogPost(float rating, String comment, Date date, Pilgrim pilgrim, BussinessOwner owner) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.date = date;
		this.pilgrim = pilgrim;
		this.owner = owner;
	}
	
	
	
	
}
