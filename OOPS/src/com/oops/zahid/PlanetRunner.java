package com.oops.zahid;

public class PlanetRunner {

	public static void main(String[] args) {
		PlanetPojo earth = new PlanetPojo("Earth", 4, 1500);
		PlanetPojo venus = new PlanetPojo("Venus", 3, 1200);
		
		System.out.println(earth);
		System.out.println(venus);
	}

}
