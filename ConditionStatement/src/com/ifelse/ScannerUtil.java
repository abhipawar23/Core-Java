package com.ifelse;

import java.util.Scanner;

public class ScannerUtil {

	public static void m1() {

		System.out.println("m1 method started----");
		// Scanner is used to take input from USER
		// System.in --> to take input exactly from Console...
		Scanner sc = new Scanner(System.in);//

		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("First Number is  : " + a);

		System.out.println("Enter your 2nd number");
		int b = sc.nextInt();
		System.out.println("Second Number is  : " + b);

		if (a >b) {// >, < , >=, <=, ==
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is less than b");
		}

		System.out.println("m1 method Completed----");

	}
}
