package com.interfaceinheritance;

public class CallBy implements Demo {

	public static void main(String[] args) {
		// ways of calling variable

		System.out.println(Demo.A);
		System.out.println(CallBy.A);
		System.out.println(A);

		Demo d = new CallBy();
		System.out.println(d.A);

		CallBy callby = new CallBy();
		System.out.println(callby.A);

	}

}