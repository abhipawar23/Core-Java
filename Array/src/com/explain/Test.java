package com.explain;

public class Test {
	public static void main(String[] args) {
		// String s=args[1]; arrayIndexOutOfBound Exception
		int[] arrayOffint; // Declaration of array

		int[] arrayOfint = new int[5]; // Instantiating An Array Object

		arrayOfint[0] = 1;
		arrayOfint[1] = 2;
		arrayOfint[2] = 3;
		arrayOfint[3] = 4;
		arrayOfint[4] = 5;
		// arrayOfint[5] = 5;

		// Accessing Array Element
		System.out.println(arrayOfint[0]);
		System.out.println(arrayOfint[1]);
		System.out.println(arrayOfint[2]);
		System.out.println(arrayOfint[3]);
		System.out.println(arrayOfint[4]);

		System.out.println("Second Way");

		// int i = arrayOfint[3];
		// System.out.println(i);

		System.out.println("Array Of Length Is:" + arrayOfint.length);

		System.out.println("Using For Loop");
		for (int i = 0; i < arrayOfint.length; i++) {
			System.out.println(arrayOfint[i]);
		}
	}
}
