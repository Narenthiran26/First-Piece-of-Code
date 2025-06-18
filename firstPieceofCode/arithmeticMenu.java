package com.naren.firstPieceofCode;

import java.util.Scanner;

public class arithmeticMenu {
	public static void main(String args[]) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter 1st num: ");
		int num1 = scan1.nextInt();
	
		System.out.println("enter 2nd num: ");
		int num2 = scan1.nextInt();
		
		System.out.println("choices available are");
		System.out.println("1-add");
		System.out.println("2-subtract");
		System.out.println("3-divide");
		System.out.println("4-multiply");
		
		System.out.println("enter choice: ");
		int choice = scan1.nextInt();
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("choice: " + choice);
		System.out.println(" ");
		
		arithmeticUsingIfElse(num1, num2, choice);
		arithmeticUsingSwitch(num1, num2, choice);
		
	}


	private static void arithmeticUsingIfElse(int num1, int num2, int choice) {
		if(choice==1) {
			System.out.println("result: "+ (num1+num2));
		}else if(choice==2) {
			System.out.println("result: "+ (num1-num2));
		}else if(choice==3) {
			System.out.println("result: "+ (num1/num2));
		}else if(choice==4) {
			System.out.println("result: "+ (num1*num2));
		}else {
			System.out.println("number "+ choice + " is an invalid choice");
		}
	}
	
	private static void arithmeticUsingSwitch(int num1, int num2, int choice) {
		switch(choice) {
		case 1: System.out.println("result: "+ (num1+num2));break;
		case 2: System.out.println("result: "+ (num1-num2));break;
		case 3: System.out.println("result: "+ (num1/num2));break;
		case 4: System.out.println("result: "+ (num1*num2));break;
		default: System.out.println("number "+ choice + " is an invalid choice");
		}

	}
}
