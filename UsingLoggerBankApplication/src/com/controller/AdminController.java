package com.controller;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sbi.service.RBI;
import com.sbi.servicelmpl.SBI;

public class AdminController {

	public static final Logger LOGGER = LogManager.getLogger(AdminController.class);

	public static int choice() {
		Scanner sc = new Scanner(System.in);
		try {
			int ch = sc.nextInt();
			return ch;
		} catch (Exception e) {
			LOGGER.error("This Is Not Valid Selection...Try Again");
			LOGGER.info("Select One Of The Abow Menu:");
			return choice();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();
		do {
			LOGGER.debug("\n===MENU===");
			LOGGER.info("1. Create/Open Account");
			LOGGER.info("2. Display Account Balance");
			LOGGER.info("3. Display Account Details");
			LOGGER.info("4. Deposite Amount");
			LOGGER.info("5. Withdraw Amount");
			LOGGER.info("6. Update Profile Details");
			LOGGER.info("7. Exit The Applocation");

			LOGGER.info("Select One Of The Abow Menu");
			int ch = choice();

			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.displayBalance();
				break;
			case 3:
				rbi.displayDetails();
				break;
			case 4:
				rbi.depositeAmount();
				break;
			case 5:
				rbi.withdrawAmount();
				break;
			case 6:
				rbi.updateProfile();
				break;
			case 7:
				LOGGER.debug("User Want To Exit The Applocation\n***THANK YOU***");
				flag = false;
				break;
			default:
				LOGGER.warn("This Is Not Valid Input");
				break;
			}
		} while (flag);

	}

}
