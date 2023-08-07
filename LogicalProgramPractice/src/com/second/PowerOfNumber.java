package com.second;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:- ");
		int n = sc.nextInt();
		System.out.println("Enter Power Number:- ");
		int lc = sc.nextInt();
		int pow = 1;
		for (int i = 1; i <= lc; i++) {

			pow = pow * n;
		}

		System.out.println("Power Of Number Is :- " + pow);
	}
}
