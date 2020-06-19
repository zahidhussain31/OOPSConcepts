package com.oops.zahid;

public class PlanetPojo {
	String PlanetName;
	int Location;
	int DistanceFromSun;
	public PlanetPojo(String planetName, int location, int distanceFromSun) {
		super();
		PlanetName = planetName;
		Location = location;
		DistanceFromSun = distanceFromSun;
	}
	public String getPlanetName() {
		return PlanetName;
	}
	public void setPlanetName(String planetName) {
		PlanetName = planetName;
	}
	public int getLocation() {
		return Location;
	}
	public void setLocation(int location) {
		Location = location;
	}
	public int getDistanceFromSun() {
		return DistanceFromSun;
	}
	public void setDistanceFromSun(int distanceFromSun) {
		DistanceFromSun = distanceFromSun;
	}
	@Override
	public String toString() {
		return "PlanetPojo [PlanetName=" + PlanetName + ", Location=" + Location + ", DistanceFromSun="
				+ DistanceFromSun + "]";
	}
	
}
