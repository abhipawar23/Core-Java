package com.explain;

public class TimePass extends TATA {
	//vehicle>TATA>TimePass
	
	public void tPassOwnmethod() {
		System.out.println("timepass class own method");
	}
 
	public void specification() {
		System.out.println("spe.of time pass");
	}
	
	public static void main(String [] args) {
		System.out.println("object of tata + timepass class");
	     TATA abc = new TimePass();
	     abc.tyre();
	     abc.specification();
	     abc.ownerName("PAWAR");
	     
	     TimePass timepass = new TimePass();
	     timepass.tyre();
	     timepass.specification();
	     timepass.ownerName("xyz");
	     timepass.tPassOwnmethod();
	     
	     
	     
	     
	}
}
