package com.six;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :- ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			System.out.println("The Number Is Perfect...");
		} else {
			System.out.println("The Is Not Perfect...");
		}
	}

}
