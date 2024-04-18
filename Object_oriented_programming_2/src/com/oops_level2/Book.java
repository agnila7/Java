package com.oops_level2;

import java.util.ArrayList;

public class Book {

	//state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	//creation
	public Book(int id, String name, String author) {
		this.id =id;
		this.name =name;
		this.author = author;
		
	}
	
	//operations
//	public Review getReview() {
//		return review;
//	}
//	
//	public void setReview(Review review) {
//		this.review = review;
//	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("Book: id - %d, name - %s, author -%s, Review: [%s]", id, name, author, reviews);
	}
	
}
