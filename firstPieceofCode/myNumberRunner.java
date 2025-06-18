package com.naren.firstPieceofCode;

public class myNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myNumber num= new myNumber(5);
		boolean isPrime = num.isPrime();
		System.out.println("isPrime "+ isPrime);
		System.out.println("sum of numbers is "+ num.sumOfNum());
		System.out.println("sum of divisors is "+ num.sumOfDivisor());
		num.numberTriangle();
		
	}

}
