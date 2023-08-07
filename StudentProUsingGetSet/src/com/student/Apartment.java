package com.student;

public class Apartment {

	private int flatenumber;
	private String flateowner;
	private char building;

	public String toString() {
		String abc = flatenumber + " " + flateowner + " " + building;
		return abc;
	}

	public char getBuilding() {
		return building;
	}

	public void setBuilding(char building) {
		this.building = building;
	}

	public int getFlatenumber() {
		return flatenumber;
	}

	public void setFlatenumber(int x) {
		this.flatenumber = x;
	}

	public String getFlateowner() {
		return flateowner;
	}

	public void setFlateowner(String flateowner) {
		this.flateowner = flateowner;
	}

}
