package com.ifelse;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		m1();
	}
		public static void m1(){
		System.out.println("main method started----");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name: ");
		String name = sc.next();

		System.out.println("Enter your % : ");
		int per = sc.nextInt();
		// 62
		if (per >= 66) {//
			System.out.println(name + " are in distinction class....");
		} else if (per >= 60) {//
			System.out.println(name + "You are in first class....");
		} else if (per >= 55) {
			System.out.println("You are in Higher second class....");
		} else if (per >= 40) {
			System.out.println("You are in pass class...");
		} else {
			System.out.println("you are in fail class..");
		}

		System.out.println("main method completed----");
	}

}
