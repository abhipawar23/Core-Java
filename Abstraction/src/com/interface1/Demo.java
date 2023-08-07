package com.interface1;

public class Demo implements I {

	public void m1() {
		System.out.println("implemented m1 method in demo class");
	}

	public void m2() {
		System.out.println("implimanted m2 method in demo class");
	}

	public static void main(String[] args) {

		// I i = new I(); interface class object does not create

		System.out.println(I.i); // without obj call bec static method //call by interface name

		I i = new Demo();
		i.m1();
		i.m2();
		System.out.println(I.i);
		System.out.println(j);

		Demo d = new Demo();
		System.out.println("\n");
		d.m1();
		d.m2();
		System.out.println(i);
		System.out.println(j);

	}

}
