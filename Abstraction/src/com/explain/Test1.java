package com.explain;

public class Test1 extends Test {

	@Override
	public void m1() {
		
		System.out.println("implementation method m1 in child class");
	}

	
	public void m3() {
		
		System.out.println("m3 method of test1 class");
	}
	
	public static void main(String[] args) {
		// Test t = new Test(); //abstract (parent) class object does not work

		Test t = new Test1(); // indirect object // p+c object
		t.m1();
		t.m2();
		//t.m3();  // loose coupling object
		
		Test1 t1 = new Test1();
		t1.m1();
		t1.m2();
		t1.m3();   // tight coupling object

	}

}