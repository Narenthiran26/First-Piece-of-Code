package com.naren.firstPieceofCode;

public class books {
	private int noOfPages;
	
	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		if(noOfPages > 0)
		this.noOfPages = noOfPages;
	}
	
	public void increaseNoOfPages(int nNoOfPages) {
		setNoOfPages(this.noOfPages + nNoOfPages);
	}
	
	public void decreaseNoOfPages(int nNoOfPages) {
		setNoOfPages(this.noOfPages - nNoOfPages);
	}

	void book() {
		System.out.println("Reading the book");
	}

}
