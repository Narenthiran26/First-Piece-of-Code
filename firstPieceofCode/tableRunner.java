package com.naren.firstPieceofCode;

public class tableRunner {

	public static void main(String[] args) {
		singleMultiplicationTable fiveTableRun = new singleMultiplicationTable();
		fiveTableRun.table();
		
		singleMultiplicationTable userSpecTable = new singleMultiplicationTable();
		userSpecTable.table(10);
	}
	

}
