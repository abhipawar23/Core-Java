package com.five;

import java.util.Scanner;

public class FibonousSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Limit :-");
		int n = sc.nextInt();

		int first = 0, second = 1, third;
		System.out.print(first + " " + second);

		for (int i = 2; i < n; i++) {
			third = first + second;
			System.out.print(" " + third);
			first = second;
			second = third;
		}
	}
}
