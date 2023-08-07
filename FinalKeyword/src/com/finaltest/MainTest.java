package com.finaltest;
//final keyword basically it is use for restrict the user data.

//we can use final keyword before class,data members(variables),method

public class MainTest {
	 int id = 1;
	final String StudentName = "ABHI";

	public void m1() {
		System.out.println("m1 method of MainTest class");
	}

	public final void m2() {
		System.out.println("m2 method of MainTest class");
	}

	public static void main(String[] args) {
		MainTest maintest = new MainTest();
		 maintest.id = 100;
		// maintest.StudentName = "xyz";
		System.out.println("id:- " + maintest.id + " " + "\nstudentName:- " + maintest.StudentName);
	}
}
