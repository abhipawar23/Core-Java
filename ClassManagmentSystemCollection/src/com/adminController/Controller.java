package com.adminController;

import java.util.Scanner;

import com.service.Service;
import com.serviceImpl.ServiceImpl;

public class Controller {

	public static int getChoice() {
		Scanner sc = new Scanner(System.in);
		try {
			int choice = sc.nextInt();
			return choice;
		} catch (Exception e) {
			System.out.println("This Is Not Valid Selection...Try Again");
			System.out.println("Select One Of The Abow Menu:");
			return getChoice();
		}
	}

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("\n<-----MENU----->");
			System.out.println("1.Add Cource Details");
			System.out.println("2.Display Cource Details");
			System.out.println("3.Add Faculty Details");
			System.out.println("4.Display Faculty Details");
			System.out.println("5.Add Batch Details");
			System.out.println("6.Dispay Batch Details");
			System.out.println("7.Add Student Details");
			System.out.println("8.Disply Studend Details");
			System.out.println("9.Exit The Application");
			System.out.println("Select One Of The Abow Menu");

			int choice = getChoice();

			switch (choice) {
			case 1:
				service.addCourceDetails();
				break;
			case 2:
				service.displayCourceDetails();
				break;
			case 3:
				service.addFacultyDetails();
				break;
			case 4:
				service.displayFacultyDetails();
				break;
			case 5:
				service.addBatchDetails();
				break;
			case 6:
				service.displayBatchDetails();
				break;
			case 7:
				service.addStudentDetails();
				break;
			case 8:
				service.displayStudentDetails();
				break;
			case 9:
				flag = false;
				System.out.println("User Want to Stop Application\n***THANK YOU***");
				break;
			default:
				System.out.println("This Is Not Valid Input...Try Again");
				break;
			}
		} while (flag);
	}
}