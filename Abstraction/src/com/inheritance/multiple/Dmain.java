package com.inheritance.multiple;

public class Dmain implements A,B,C {

	public void cOwnMethod() {
		System.out.println("cOwnMethod of C");
		
	}

	public void m2() {
		System.out.println("m2 method of B ");
		
	}

	public void m3() {
		System.out.println("m3 method of B");
		
	}

	public void m1() {
	 System.out.println("m1 method of A,C");
		
	}
	
	public static void main(String[]args) {
		A a = new Dmain();
		a.m1();
		
		B b = new Dmain();
		b.m2();
		b.m3();
		
		C c = new Dmain();
		c.m1();
		c.cOwnMethod();
	}

}
