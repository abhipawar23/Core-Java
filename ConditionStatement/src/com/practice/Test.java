package com.practice;

import java.util.Scanner;

public class Test {

	public static void m1() {
		boolean flag = true;
		if (flag) {
			System.out.println("Either value true in\n");
		}

		boolean flag1 = false;
		if (flag1) {
			System.out.println("Either value flase out");
		}
	}

	public static void festiblePass() {
		boolean EntryPass = false;
		if (EntryPass) {
			System.out.println("Permision Granted\n");
		} else {
			System.out.println("Permision Not-Granted\n");
		}
	}

	public static void variableSize() {
		float x = 10.1f, y = 100.1f;
		System.out.println("Result:- " + (x > y));

		if (x > y) {
			System.out.println(x + "is greater than " + y);
		} else {
			System.out.println(x + " less than " + y);
		}

	}

	public static void m2() {
		int a = 100;
		System.out.println("\n"+(a>=100));

		int x = 10, y = 10;
		if (x == y) {
			System.out.println("\n its true");
		}
	}
		
	
	public static void main(String[] args) {
		m1();
		festiblePass();
		variableSize();
		m2();
		
		
		

	}
}
