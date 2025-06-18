package com.naren.firstPieceofCode;

public class bookRunner {

	public static void main(String[] args) {
		books artOfJava = new books();
		books javaBasics = new books();
		books coreJava = new books();
		
		artOfJava.book();
		javaBasics.book();
		coreJava.book();
		
		artOfJava.setNoOfPages(20);
		javaBasics.setNoOfPages(50);
		coreJava.setNoOfPages(100);
		
		artOfJava.increaseNoOfPages(-10);
		javaBasics.increaseNoOfPages(-20);
		coreJava.increaseNoOfPages(-30);
		
//		System.out.println(artOfJava.getNoOfPages());
//		System.out.println(javaBasics.getNoOfPages());
//		System.out.println(coreJava.getNoOfPages());
		
		artOfJava.decreaseNoOfPages(20);
		javaBasics.decreaseNoOfPages(30);
		coreJava.decreaseNoOfPages(40);
		
		System.out.println(artOfJava.getNoOfPages());
		System.out.println(javaBasics.getNoOfPages());
		System.out.println(coreJava.getNoOfPages());
	}
	
	

}
