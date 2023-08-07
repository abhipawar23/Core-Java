package com.interfaceinheritance;

public class Dmain extends C {

	public void p1() {
		System.out.println("implement method of p1 ");
		
	}
	
	public static void main(String[]args) {
		C c = new Dmain();
		c.p1();
		c.p2();
		c.p3();
		
	}

}
