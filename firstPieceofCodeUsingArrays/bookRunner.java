package com.naren.firstPieceofCodeUsingArrays;

public class bookRunner {

	public static void main(String[] args) {
		Book book=new Book(123,"java fund.","naren");
		book.addReview(new Review(10,"good",4));
		book.addReview(new Review(12,"vGood",5));
		System.out.println(book);

	}

}
