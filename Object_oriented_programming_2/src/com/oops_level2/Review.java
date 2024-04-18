package com.oops_level2;

public class Review {

	//state
	private int id;
	private String description;
	private int rating;

	//creation
	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	public String toString() {
		return (id + ": " + description + " " + "rating: " + rating);
	}
}
