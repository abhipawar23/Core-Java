package com.methodOverloading;

public class Demo {
	public void createAccount(int i) {
		System.out.println("single parameter method");
		System.out.println("---saving account flow---");
		// code saving account
	}

	public void createAccount(int k, int j) {
		System.out.println("double parameter method ");
		System.out.println("----current account flow----");
		// code current account
	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		//demo.createAccount(10);
		demo.createAccount(20, 80);
		// user
		// input 10 : Saving account
		// 10, 20 : current account

		System.out.println("---Java Live example----");

		System.out.println(11);
		System.out.println('c');
		System.out.println("11");
		System.out.println(10.123);
		System.out.println(true);
		System.out.println(10.12f);
		System.out.println(10l);

	}
}