package com.first;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:-");
		int n = sc.nextInt();
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		System.out.println("Factorial Is:- " + fac);
	}
}
