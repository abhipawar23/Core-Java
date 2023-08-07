package com;

public abstract class Test {

	abstract void add();

	public void m1() {
		System.out.println("M1 Method...");
	}

	public static void main(String[] args) {

		System.out.println("Main Method");
		Test test = new Test() {

			@Override
			void add() {
				// TODO Auto-generated method stub
				System.out.println("Add Method...");
			}

		};
		test.m1();
	}
}
