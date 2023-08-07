package com.loop;

import java.util.Scanner;

public class ForLoop {
	// Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// ForLoop f=new ForLoop();
		// f.practice();
		practice();
		for (int count = 1; count <= 5; count++) {
			System.out.println(count + " INSIDE LOOP");
		}

		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			sum = m1(i, sum);
		}
		System.out.println("sum is:- " + sum);

	}

	public static int m1(int a, int b) {
		return a + b;
	}

	public static void practice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value sum for");
		int x = sc.nextInt();
		System.out.println("Enter a second value sum upto");
		int y = sc.nextInt();
		int sum = 0;
		while (x <= y) {
			sum = sum + x;
			x++;
		}
		System.out.println("Sum of natural number is:- " + sum+"\n");

	}
}
