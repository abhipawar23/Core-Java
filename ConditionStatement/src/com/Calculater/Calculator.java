package com.Calculater;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Calculator started----");
		boolean flag = true;
		while (flag) {
			System.out.println("----MENU-------");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divison");
			System.out.println("5. Exit...");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Choice From above Menu :");
			int choice = sc.nextInt();
			int num1 = 0, num2 = 0;

			// 1+1+1+1--> 1
			// 1+0+0+0--> 1
			// 0+1+1+1-->1
			// 0+0+0+0-->0// 0+0+0+0-->
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) { // 5!=5-- > false, 5==5-> true
				System.out.println("Enter 1st Numb: ");
				num1 = sc.nextInt();

				System.out.println("Enter 2nd Numb: ");
				num2 = sc.nextInt();
			}

			switch (choice) {

			case 1:
				int sum = addition(num1, num2);
				System.out.println("Sum is : " + sum);
				break;
			case 2:
				int sub = substraction(num1, num2);
				System.out.println("Substraction is : " + sub);
				break;
			case 3:
				int mul = multiplication(num1, num2);
				System.out.println("Multiplication is : " + mul);
				break;
			case 4:
				int div = division(num1, num2);
				System.out.println("Div is : " + div);

			case 5:
				flag = false;
				System.out.println("Selected to exit");
				break;
			default:
				System.out.println("Invalid choice, try again..");
				break;
			}
			System.out.println("\n\n");
		}
		System.out.println("Calculator Stopped----");
	}

	private static int addition(int a, int b) {
		System.out.println("Addition method called..");
		return a + b;
	}

	private static int substraction(int a, int b) {
		System.out.println("Substraction method called..");
		return a - b;
	}

	private static int multiplication(int a, int b) {
		System.out.println("Multiplication method called");
		return a * b;
	}

	private static int division(int a, int b) {
		System.out.println("Division method called");
		return a / b;

	}

}
