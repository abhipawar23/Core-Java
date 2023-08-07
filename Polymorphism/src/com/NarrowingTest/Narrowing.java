package com.NarrowingTest;

public class Narrowing {

     //	p-->Q-->R
	
	public static void m1(Object o) {
		System.out.println("Object");
	}

	public static void m1(String s) {
		System.out.println("String");
	}

	//public static void m1(Integer i) {
	//	System.out.println("integer");
	//}

	public static void main(String[] args) {
		m1(null); // null value

	}
}
