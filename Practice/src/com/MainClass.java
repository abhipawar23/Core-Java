package com;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new Y();
		x.m1(10, 20);
		Y y = (Y) x;
		y.m1(20, 30);
		Z z = (Z) y;
		z.m1(50, 100);
	}

}

class X {
	void m1(int a, int b) {
		System.out.println("X");
	}
}

class Y extends X {
	void m1(int a, int b) {
		System.out.println("Y");
	}
}

class Z extends Y {
	void m1(int a, int b) {
		System.out.println("z");
	}
}