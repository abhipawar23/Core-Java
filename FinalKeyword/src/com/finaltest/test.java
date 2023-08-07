package com.finaltest;

public class test extends MainTest {

	
	@Override
	public void m1() {
		System.out.println("m1 method of test class");
	}

	public static void main(String[] args) {
		MainTest m = new MainTest();
		m.m1();
		m.m2();
		System.out.println(m.id);
		System.out.println(m.StudentName + "\n");

		MainTest m1 = new test();
		m1.m1();
		m1.m2();
		System.out.println(m1.id);
		System.out.println(m1.StudentName + "\n");

		test t = new test();
		t.m1();
		t.m2();
		System.out.println(t.id+" "+t.StudentName);

	}
}