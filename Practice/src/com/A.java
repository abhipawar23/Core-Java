package com;

public class A {

	static int count;

	A() {
		System.out.println("Def Con Of A");
		if (count == 2) {
			System.exit(0);
		}
		count++;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.hashCode());
		A a1 = new A();
		System.out.println(a1.hashCode());
		A a2 = new A();
		System.out.println(a2.hashCode());
		System.out.println("hello");

	}
}
