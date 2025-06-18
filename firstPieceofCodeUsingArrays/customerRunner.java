package com.naren.firstPieceofCodeUsingArrays;

public class customerRunner {

	public static void main(String[] args) {
		Address homeAddress= new Address("line1","chennai",600091);
		Customer customer=new Customer("Naren",homeAddress);
		System.out.println(customer);
		Address workAddress=new Address("wline1","bangalore",600019);
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
