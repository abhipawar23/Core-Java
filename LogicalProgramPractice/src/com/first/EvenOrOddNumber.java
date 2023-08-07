package com.first;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:-");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " Number Is Even");
		} else {
			System.out.println(n + " Number Is Odd");
		}

	}
}
