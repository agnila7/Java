package com.oops_level2;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book(1, "Ratuler din ratri", "Md. Zafar Iqbal");
		
//		Review review = new Review(7, "Great Book", 5);
//		book.setReview(review);
		book.addReview(new Review(7, "Great Book", 5));		
		book.addReview(new Review(420, "loved it", 5));
		System.out.println(book);
	}

}
