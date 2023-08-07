package com.practice;

public class child extends parent {

	child() {
		this(10);
		System.out.println("Default con of child class");
	}

	child(int i) {
		this("abc",false,12.2f);
		System.out.println("singal para");
	}

	child(String s, boolean b, float f) {
		System.out.println("triple para of child class");
	}

	public static void main(String[] args) {
		child c = new child();

	}
}
