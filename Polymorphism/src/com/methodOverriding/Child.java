package com.methodOverriding;

public class Child extends Parent {

	// Super : Parent
	// Subclass : Child

	@Override
	public void m1() {
		System.out.println("child class overrided method");
	}

	@Override
	public void m2(int i) {
		System.out.println("overrided m2 method in child class");
	}

	@Override
	public char m3() {

		System.out.println("overrided m3 child");
		return 'A';
	}

	@Override
	public Parent m4() {
		Child c = new Child();
		return c;
	}

	@Override
	public void m5() {

	}

	public static void m7() {
		System.out.println("static method of child class");
	}

	public static void main(String[] args) {

		Parent.m7();
		Child.m7();
		Parent p = new Parent();
		// only parent
		p.m1();
		// Parent child mix
		Parent p1 = new Child();
		p1.m1();
		System.out.println("parent child mix");
		p1.m7();
		// Child class
		Child c = new Child();
		c.m1();
		c.m7();

	}

}
