package com.third.four;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:- ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum Of Number Is :- " + sum);
	}
}
