package com.para;

public class Test {

	public void m1() {
		System.out.println("-----without parameter method----");
	}

	// primitive data type , non primitive data types , custome classes
	public void m2(int i) {
		System.out.println("single parameter method");
		System.out.println(i);
	}

	public String m3(String s, double d) {

		System.out.println("double parameter method ");
		System.out.println(s + " " + d);
		return "abc";
	}

	public int m4(int i, char c, boolean b) {
		System.out.println("m4 method with three parameter");
		System.out.println(i + " " + c + " " + b);
		return 89;
	}

	public void m5(long l) {
		System.out.println("m5 method of Test class");
		System.out.println(l);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
		test.m2(80);
	    test.m3("ABHI", 10.123);
		test.m4(90, 'A', false);
		test.m5(777l);

	}

}