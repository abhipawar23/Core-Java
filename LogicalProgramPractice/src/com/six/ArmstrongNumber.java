package com.six;

import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :-");
		int n = sc.nextInt();
		int digit = 0, last = 0, sum = 0;
		int temp = n, temp1 = n;

		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}

		while (temp1 > 0) {
			last = temp1 % 10;
			sum += (int) Math.pow(last, digit);
			temp1 = temp1 / 10;
		}

		if (sum == n) {
			System.out.println("Number Is Armstrong...");
		} else {
			System.out.println("Number Is Not Armstrong");
		}

	}
}
