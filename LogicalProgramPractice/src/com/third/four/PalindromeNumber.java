package com.third.four;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:- ");
		int n = sc.nextInt();
		int rev = 0, r;
		int n1 = n;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (n1 == rev) {
			System.out.println("Number Is Palindrome...");
		} else {
			System.out.println("Number Is Not Palindrome...");
		}
	}
}
