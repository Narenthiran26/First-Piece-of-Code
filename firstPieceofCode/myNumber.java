package com.naren.firstPieceofCode;

public class myNumber {
	private int num;
	public myNumber(int num) {
		this.num=num;
	}
public boolean isPrime() {
	for(int i=2;i<num-1;i++) {
	if(num%i==0){
		return false;
		}
	}return true;
  }
public int sumOfNum() {
	int sum=0;
	for(int i=0;i<=num;i++) {
		sum+=i;
	}return sum;
  }
public int sumOfDivisor() {
	int sum=0;
	for(int i=2;i<num-1;i++) {
		if(num%i==0) {
			sum+=i;
		}
	}return sum;
}
public void numberTriangle() {
	for(int i=1;i<num;i++){
		for(int j=1;j<i;j++) {
		System.out.print(j + " ");
		}
		System.out.println();
	}
  }
}
