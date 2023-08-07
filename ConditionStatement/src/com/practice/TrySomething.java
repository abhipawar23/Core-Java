package com.practice;

import java.util.Scanner;

public class TrySomething {

	public static void employee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name:-");
		String name = sc.next();

		System.out.println("Enter Employee Salary:-");
		int salary = sc.nextInt();

		if (salary >= 100000) {
			System.out.println(name + " working exp is 5 year");
		} else if (salary >= 80000) {
			System.out.println(name + " working exp is 3 year");
		} else if (salary >= 60000) {
			System.out.println(name + " working exp is 2 year");
		} else if (salary >= 30000) {
			System.out.println(name + " working exp is 1 year");
		} else if (salary >= 10000) {
			System.out.println(name + " is fresher");
		} else {
			System.out.println(name + " work on intenship");
		}

	}

	public static void main(String[] args) {
		employee();

	}

}
