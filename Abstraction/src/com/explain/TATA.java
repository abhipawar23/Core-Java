package com.explain;

public class TATA extends Vehicle {

	@Override
	public void specification() {

		System.out.println("TATA Specification method");

	}
	
	public void ownerName(String s){
		
		System.out.println("\nOwnerName:-"+s);
		
	}

	public static void main(String[] args) {
		Vehicle vt = new TATA();
		System.out.println("indirect object i.e p+c object");
		vt.tyre();
		vt.specification();

		TATA tata = new TATA();
		System.out.println("\nTATA class object i.e implemantatiob object");
		tata.tyre();
		tata.specification();
	    tata.ownerName("ABHISHEK");
	}
}
