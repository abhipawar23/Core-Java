package com.methodOverloading;

public class Test {

	public void m1(String s) {

		System.out.println("line nu 7");
	}

	public void m1(int i, String s) {
		System.out.println("line nu 11");
	}
	
	public static void main(String[] args) {
		
		Test test= new Test();
		test.m1(10,"ABHI");
	}

}
