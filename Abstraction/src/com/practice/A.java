package com.practice;

public class A{
	
	public void method() {
		
		int i = 10;
		System.out.println(i);
	}
	
	//public static void main(String[] args) {
		 //A a =new A();
		//a.method();
		
		
//	}
}

 class abc extends A{
	 
	 public void m1() {
		 System.out.println("m1 method");
	 }
	 
	 public static void main(String[] args) {
		abc ab = new abc();
		ab.m1();
	}	
}