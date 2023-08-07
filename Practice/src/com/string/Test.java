package com.string;

public class Test {

	public static void main(String[] args) {

//		String s = "abc"; // literal //constant pool area
//
//		s = s.concat("efg");
//
//		System.out.println(s);
//
//		String s1 = new String("abc"); // new //heap area
//
//		int i = 10 , j =100;
//		System.out.println(String.format("Student %d %dStored Sucessfully", i,j));
		Test t = new Test();
		Object o = new String();
		t.m1(o);
	}

	public void m1(Object o) {
		System.out.println("111");
	}

	public void m2(String s) {
		System.out.println("222");
	}

	public void m2(Integer i) {
		System.out.println("333");
	}
}
