package com.logical.pro;

public class Star {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		for (int i = 5; i >= 0; --i) {
			for (int j = 0; j >= i; --i) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
