package com.naren.firstPieceofCode;

public class bikeRunner {

	public static void main(String[] args) {
		motorBike honda = new motorBike();
		motorBike hero = new motorBike();
		
		honda.start();
		honda.setSpeed(70);
		System.out.println(honda.getSpeed());
		
		hero.start();
		hero.setSpeed(60);
		System.out.println(hero.getSpeed());
		
		
		

	}

}
