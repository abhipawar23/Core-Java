package com.loop;

public class While {

	private static void runMethod() {
		System.out.println("Run Method Executed");
	}

	public static void m1() {
		int start = 5;
		while (start >= 1) {
			System.out.print(start + " ");
			runMethod();
			start--; // reverse way or decrement operator
		}

		// int f = 1;
		// while (f <= 5) {
		// System.out.print(f + "INFINITY"); //reverse way infanite loop
		// f--;
		// }
	}

	public static void main(String[] args) {
		m1();
		System.out.println("***********");
		boolean condition = false; // after true it executed infinity
		while (condition) {
			System.out.println("Inside While loop");
		}

		int count = 1;
		while (count <= 5) {
			System.out.print(count + " ");
			runMethod();
			//count = count + 1; 
			++count; //count++;
		}
	}

}