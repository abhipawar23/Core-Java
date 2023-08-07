package com.second;

import java.util.Scanner;

public class LargestNumberFind {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Number:- ");
		int x = sc.nextInt();

		System.out.println("Enter Your Second Number:-");
		int y = sc.nextInt();

		System.out.println("Enter Your Third Number:-");
		int z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println(x + " Is Greater");
		} else if (y > x && y > z) {
			System.out.println(y + " Is Greater");
		} else {
			System.out.println(z + " Is Greater");
		}

	}
}
