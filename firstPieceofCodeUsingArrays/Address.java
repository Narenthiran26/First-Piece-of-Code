package com.naren.firstPieceofCodeUsingArrays;

public class Address {

	private String line1;
	private String city;
	private long zip;
	
	public Address(String line1, String city, long zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("Line1[%s],city[%s],zip[%s]",line1,city,zip);
	}

	
}
