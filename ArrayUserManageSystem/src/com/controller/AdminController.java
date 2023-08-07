package com.controller;

import java.util.Scanner;

import com.service.UserService;
import com.serviceImpl.UserServiceImpl;


public class AdminController {
	public static void main(String[] args) {
		int choice = 0;
		UserService user = new UserServiceImpl();
		boolean flag = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n--Welcome To User Management Application--");
			System.out.println("-----------MENU------------");
			System.out.println("1.Add User");
			System.out.println("2.Display User Details");
			System.out.println("3.Delete User Details");
			System.out.println("4.Update User Details");
			System.out.println("5.Exit The Application");

			System.out.println("Select One Of The Abow Menu");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				choice = 404;
			}
			switch (choice) {
			case 1:
				user.userDetails();
				break;
			case 2:
				user.displayUserDetails();
				break;
			case 3:
				user.deleteUSerDetails();
				break;
			case 4:
				user.updateUSerDetails();
				break;
			case 5:
				System.out.println("User Want To Exit The Application");
				flag = false;
				break;
			default:
				System.out.println("This Is Not Valid Input...Try Again\n");
				break;
			}
		} while (flag);
	}

}
