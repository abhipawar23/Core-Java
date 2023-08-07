package com.explain;

public class b extends a {
	b() {
		this(10);
		System.out.println("def con of b class");
	}

	b(int i) {
		this("abc", 11.123);
		System.out.println("single para");
	}

	b(String s, double d) {
		super(true);
		System.out.println("double para");
	}

	public static void main(String[] args) {
		b B = new b();
	}
}
