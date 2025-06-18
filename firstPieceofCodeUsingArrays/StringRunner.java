package com.naren.firstPieceofCodeUsingArrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		String dayMostCharacter="";
		for(String day:daysOfTheWeek) {
			if(day.length()>dayMostCharacter.length()) {
				dayMostCharacter = day;
			}
		}
		System.out.println("daysmax " + dayMostCharacter);
		
		for(int i=daysOfTheWeek.length-1;i>=0;i--) {
			System.out.println(daysOfTheWeek[i]);
		}
	}
}
