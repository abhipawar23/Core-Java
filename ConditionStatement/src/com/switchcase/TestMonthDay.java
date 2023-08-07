package com.switchcase;

import java.util.Scanner;

public class TestMonthDay {

	private static void checkMonthHoliday() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("===>MENU<===");
			System.out.println("1. Month");
			System.out.println("2. Day");
			System.out.println("3. Exist\n");
			System.out.println("Select One Abow Menu :-");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				m1();
				break;
			case 2:
				day();
				break;
			case 3:
				flag = false;
				System.out.println("Thanx u for visiting");
				break;
			default:
				System.out.println("this is not valid input");
				break;

			}
		}
	}

	public static void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("Its Jan Month");
			janHoliday();
			break;

		case 2:
			System.out.println("Its Feb Month");
			febHoliday();
			break;

		case 3:
			System.out.println("Its March Month");
			marchHoliday();
			break;

		case 4:
			System.out.println("Its April Month");
			aprilHoliday();
			break;

		case 5:
			System.out.println("Its May MOnth");
			mayHoliday();
			break;

		case 6:
			System.out.println("Its Jun Month");
			junHoliday();
			break;

		case 7:
			System.out.println("Its Jully Month");
			jullyHoliday();
			break;

		case 8:
			System.out.println("Its Aug Month");
			augHoliday();
			break;

		case 9:
			System.out.println("Its Sep Month");
			sepHoliday();
			break;

		case 10:
			System.out.println("Its Oct MOnth");
			octHoliday();
			break;

		case 11:
			System.out.println("Its Nov Month");
			novHoliday();
			break;

		case 12:
			System.out.println("Its Dec Month");
			decHoliday();
			break;

		default:
			System.out.println("Its not valid Input");
			break;
		}

	}

	protected static void janHoliday() {
		System.out.println("Jan month Have 4 Holiday");
	}

	public static void febHoliday() {
		System.out.println("Feb month have 2 Holiday");
	}

	public static void marchHoliday() {
		System.out.println("March month there is no holiday");
	}

	public static void aprilHoliday() {
		System.out.println("April month have 6 holiday");
	}

	public static void mayHoliday() {
		System.out.println("May month have 2 holiday");
	}

	public static void junHoliday() {
		System.out.println("Jun month Have 4 Holiday");
	}

	public static void jullyHoliday() {
		System.out.println("Jully month Have 4 Holiday");
	}

	public static void augHoliday() {
		System.out.println("Aug month Have 4 Holiday");
	}

	public static void sepHoliday() {
		System.out.println("Sep month Have 4 Holiday");
	}

	public static void octHoliday() {
		System.out.println("Oct month Have 4 Holiday");
	}

	public static void novHoliday() {
		System.out.println("Nov month Have 4 Holiday");
	}

	public static void decHoliday() {
		System.out.println("Dec month Have 4 Holiday");
	}

	public static void day() {
		System.out.println("Enter a Day :- ");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		switch (day) {
		case "sunday":
			System.out.println("Its Sunday Holiday");
			break;
		case "monday":
			System.out.println("Its Monday Working Day");
			break;
		case "tuesday":
			System.out.println("Its Tuesday work form home");
			break;
		case "wednesday":
			System.out.println("Its Wednesday 10hr work");
			break;
		case "thusday":
			System.out.println("Its Thusday for project presentation");
			break;
		case "friday":
			System.out.println("Its Friday work 8 hr");
			break;
		case "saturday":
			System.out.println("Its Saturday Half day");
			break;
		default:
			System.out.println("Its not valid day");
		}

	}

	public static void main(String[] args) {
		checkMonthHoliday();
	}
}
