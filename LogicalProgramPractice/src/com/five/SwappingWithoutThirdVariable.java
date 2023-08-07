package com.five;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your A variable Value");
		int a = sc.nextInt();
		System.out.println("Enter Your B Variable Value");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("A = " + a + "\n" + "B = " + b);
	}
}
