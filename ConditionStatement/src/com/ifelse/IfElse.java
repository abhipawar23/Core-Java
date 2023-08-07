package com.ifelse;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Main method started....");

		boolean flag = true;
		// condition -- true or false
		if (flag) {// if flag is true--> will execute if loop ...
			System.out.println("Inside if...");
		}

		boolean flag1 = false;

		if (flag1) {// if flag is false--> will not be execute if loop ..
			System.out.println("inside 2nd if ...");
			System.out.println("inside 2nd if ...");
			System.out.println("inside 2nd if ...");
			System.out.println("inside 2nd if ...");
		}

		boolean isPassed = false;
		if (isPassed) {
			System.out.println("You are in pass class....");
		} else {
			System.out.println("You are in fail class....");
		}

		// 5>8--> false, 5<8--> true
		int a = 100, b = 10;
		System.out.println("Result  :" + (a < b));

		if (a > b) {// >, < , >=, <=, ==
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is less than b");
		}

		System.out.println("Main method completed....");
	}
}
