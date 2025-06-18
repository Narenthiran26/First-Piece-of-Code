package com.naren.firstPieceofCode;

public class whileNumberPlayer {
	private int num;
	
	public whileNumberPlayer(int num) {
		this.num=num;
	}
	
	public void printSquaresUptoN() {
		int i =1;
		while(i<=num) {
			System.out.print(i*i +" " );
			i++;
		}
	}

	public void printCubesUptoN() {
		int i=1;
		while(i<=num) {
			System.out.print(i*i*i +" " );
			i++;
		}
		
	}
}
