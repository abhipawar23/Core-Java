package com.methodOverriding;

public class Parent {

	public void m1() {
		System.out.println("parent class m1 method");
	}

	public void m2(int i) {
		System.out.println("parent class single parameter method");
	}

	public char m3() {
		System.out.println("m3 parent class");
		return 'J';
	}

	public  Parent m4() {
		Parent p = new Parent();
		return p;
	}
	
	 void m5()
	{
		System.out.println("m5 parent class");
	}
	 
	 private void m6()
	 {
		 System.out.println("parent class private method");
	 }
	 
	 public static void m7()
	 {
		 System.out.println("static method of parent class");
	 }
}
