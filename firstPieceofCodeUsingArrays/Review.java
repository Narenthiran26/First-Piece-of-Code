package com.naren.firstPieceofCodeUsingArrays;

public class Review {
	private int id;
	private String desc;
	private int rating;
	
	public Review(int id, String desc, int rating) {
		super();
		this.id = id;
		this.desc = desc;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", desc=" + desc + ", rating=" + rating + "]";
	}
	
	
	
}
