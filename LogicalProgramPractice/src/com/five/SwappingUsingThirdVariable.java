package com.five;

import java.util.Scanner;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your A variable Value");
		int a = sc.nextInt();
		System.out.println("Enter Your B Variable Value");
		int b = sc.nextInt();
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println("A= " + a + "\n" + "B= " + b);
	}
}
