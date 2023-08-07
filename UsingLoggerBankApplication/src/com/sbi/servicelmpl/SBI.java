package com.sbi.servicelmpl;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sbi.model.Account;
import com.sbi.service.RBI;

public class SBI implements RBI {
	Account ac = new Account();
	public static final Logger LOGGER = LogManager.getLogger(SBI.class);

	public void createAccount() {
		LOGGER.debug("User Want To Create/Open Account");
		String name = getValidName();
		ac.setName(name);

		long accNum = getValidAccountNumber();
		ac.setAccountNumber(accNum);

		int pin = getValidPin();
		ac.setAccountPin(pin);

		selectBranch(); // call to selectBranch method for selecting Branch

		long mobile = getValidMobileNumber();
		ac.setMobileNumber(mobile);

		String pan = getValidPanCard();
		ac.setPanNumber(pan);

		long adharnum = getValidAdharNumber();
		ac.setAdharNumber(adharnum);

		float balance = getValidAccountBalance();
		ac.setBalanced(balance);

		String mail = getValidMail();
		ac.setGmail(mail);

		String add = getValidAddress();
		ac.setAddress(add);

		getAccountType(); // call to getAccountType method for selecting account Type
	}

	private String getValidName() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter Your Name");
		String name = sc.nextLine();
		if (name.length() < 4) {
			LOGGER.warn("Invalid Name.Plese Enter At Least Four Character Name");
			return getValidName();
		}
		try {
			Integer i = Integer.parseInt(name);
		} catch (Exception ex) {
			return name;

		}
		LOGGER.warn("Only Allow Characters Inputs");
		return getValidName();
	}

	private long getValidAccountNumber() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter Your Account Number");
		long accNum = 0;
		try {
			accNum = sc.nextLong();
			// System.out.println(accNum);
		} catch (InputMismatchException ex) {
			LOGGER.error("Invalid Ac.Number.Only Numbers Allowed");
			return getValidAccountNumber();
		}
		String accNumInString = String.valueOf(accNum);
		if (accNum <= 0 || accNumInString.length() != 5 || accNumInString.startsWith("0")) {
			LOGGER.warn("Invalid Account Number.Please Enter Five Digit Account Number");
			return getValidAccountNumber();
		}
		return accNum;
	}

	private int getValidPin() {
		Scanner sc = new Scanner(System.in);
		int pin = 0;
		LOGGER.info("Enter Account Pin");
		try {
			pin = sc.nextInt();
		} catch (InputMismatchException ex) {
			LOGGER.error("Only Allow Four Digit Integer Type Value");
			return getValidPin();
		}
		String stringPin = String.valueOf(pin);
		if (pin >= 0 && stringPin.length() == 4) {
			return pin;
		}
		LOGGER.warn("Invalid Pin.Please Enter Four Digit Pin");
		return getValidPin();
	}

	private long getValidMobileNumber() {
		Scanner sc = new Scanner(System.in);
		long mobile = 0;
		LOGGER.info("Enter Mobile Number");
		try {
			mobile = sc.nextLong();
		} catch (InputMismatchException ex) {
			LOGGER.error("Only Allow Ten Digit Integer Type Value");
			return getValidMobileNumber();
		}
		String mobileInString = String.valueOf(mobile);
		if (mobile >= 0 && mobileInString.length() == 10 && (mobileInString.startsWith("7")
				|| mobileInString.startsWith("8") || mobileInString.startsWith("9"))) {
			return mobile;
		} else {
			LOGGER.warn(
					"Invalid Mobile Number.\\nPlease Enter Ten Digit Mobile Number.It Should Be Start With 7 Or 8 Or 9");
			return getValidMobileNumber();
		}

	}

	private String getValidPanCard() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter Pan Number");
		String pan = sc.next();
		if (pan.length() == 10) {
			return pan;
		}
		LOGGER.warn("Invalid Input.Please Enter 10 Digit Alphanumeric Number");
		return getValidPanCard();
	}

	private long getValidAdharNumber() {
		Scanner sc = new Scanner(System.in);
		long adharnum = 0;
		LOGGER.info("Enter Aadhar Number");
		try {
			adharnum = sc.nextLong();
		} catch (InputMismatchException ex) {
			LOGGER.error("Only Allow Integer Type Value");
			return getValidAdharNumber();
		}
		String adharnumInString = String.valueOf(adharnum);
		if (adharnum <= 0 || adharnumInString.length() != 12 || adharnumInString.startsWith("0")) {
			LOGGER.warn("Invalid Adhar Number.Please Enter Twelve Digit Adhar Number.");
			return getValidAdharNumber();
		}
		return adharnum;

	}

	private float getValidAccountBalance() {
		Scanner sc = new Scanner(System.in);
		float balance = 0;
		LOGGER.info("Enter Account Balance");
		try {
			balance = sc.nextFloat();
		} catch (InputMismatchException e) {
			LOGGER.error("Only Allow Integer Number.Try Again");
			return getValidAccountBalance();
		}
		if (balance <= 0) {
			LOGGER.warn("Enter Valid Account Balance Try Again");
			return getValidAccountBalance();
		}
		return balance;
	}

	private String getValidMail() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter Mail Id");
		String mail = sc.next();
		if (mail.endsWith("@gmail.com") || mail.endsWith("@yahoo.com")) {
			return mail;
		}
		LOGGER.warn("Invalid Mail Id Please Enter Valid Mail ID Ends With @gmail.com OR @yahoo.com");
		return getValidMail();
	}

	private String getValidAddress() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter Your Address");
		String add = sc.next();
		try {
			Integer i = new Integer(add);
		} catch (Exception e) {
			return add;
		}
		LOGGER.warn("Only Allow Character Type Input. Try Again");
		return getValidAddress();
	}

	private int selectBranch() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Select Branch Name");

		LOGGER.info("1. Pune");
		LOGGER.info("2. Ahmednagar");
		LOGGER.info("3. Mumbai");

		int branch = 0;
		try {
			branch = sc.nextInt();
		} catch (InputMismatchException e) {
			LOGGER.error("Invalid Input.Please Try Again");
			return selectBranch();
		}
		switch (branch) {
		case 1:
			ac.setBranchName("Pune");
			LOGGER.info("User Selected Branch Name " + ac.getBranchName());
			break;
		case 2:
			ac.setBranchName("Ahmednagar");
			LOGGER.info("User Selected Branch Name " + ac.getBranchName());
			break;
		case 3:
			ac.setBranchName("Mumbai");
			LOGGER.info("User Selected Branch Name " + ac.getBranchName());
			break;
		default:
			LOGGER.warn("This is Not Valid Input Please Try Again");
			return selectBranch();
		// break;
		}
		return branch;
	}

	private void getAccountType() {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("which Account Do You Open:-\n1. Saving Account\n2. Current Account");
		int whichAcc = 0;
		try {
			whichAcc = sc.nextInt();
		} catch (InputMismatchException e) {
			LOGGER.error("Invalid Input.Try Again");
			getAccountType();
		}
		switch (whichAcc) {
		case 1:
			ac.setType("Saving");
			break;
		case 2:
			ac.setType("Current");
			break;
		default:
			LOGGER.warn("This Is Not Valid Selection");
			getAccountType();
			break;
		}
	}

	public void displayBalance() {
		if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
			LOGGER.debug("User Want To Display Account Balance :");
			System.out.println(ac.getBalanced());
		} else {
			LOGGER.warn("This Is Invalid Account Number OR Pin");
		}
	}

	public void displayDetails() {
		if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
			LOGGER.debug("User Want To Display Account Details :");
			System.out.println(ac.toString());
		} else {
			LOGGER.warn("This Is Invalid Account Number Or Pin");
		}
	}

	public void depositeAmount() {
		Scanner sc = new Scanner(System.in);
		if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
			LOGGER.debug("User Want To Deposite Amount ");
			LOGGER.info("How Much Amount Deposite ?");
			float amount = sc.nextFloat();
			float newBalance = ac.getBalanced() + amount;
			LOGGER.info("Updated Balance Is :- " + newBalance);
			ac.setBalanced(newBalance);
		} else {
			LOGGER.warn("This Is Invalid Account Number Or Pin");
		}
	}

	public void withdrawAmount() {
		Scanner sc = new Scanner(System.in);
		if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
			LOGGER.debug("User Want To Withdraw Amount");
			LOGGER.info("How Much Ammount Withdraw :- ");
			float withdraw = sc.nextFloat();
			float newBalance = ac.getBalanced() - withdraw;
			LOGGER.info("Remening Balance Is :- " + newBalance);
			ac.setBalanced(newBalance);
		} else {
			LOGGER.warn("This Is Invalid Account Number Or Pin");
		}
	}

	public void updateProfile() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
				LOGGER.debug("User Want To Update Profile Details");
				LOGGER.info(
						"1.Change Name\\n2.Change Account Pin\\n3.Change Branch Name\\n4.Change Mobile Number\\n5.Change Email Id \\n6.Change Address\\n7.Change Account Type\\n8.Exit");
				LOGGER.info("Enter Your Choice:-");
				int update = sc.nextInt();
				switch (update) {
				case 1:
					String newName = getValidName();
					ac.setName(newName);
					LOGGER.info("Your Name Is Successfully Update.");
					break;
				case 2:
					boolean flag1 = true;
					do {
						int newPin1 = getValidPin();
						LOGGER.info("Re-Enter Your New Pin");
						int newPin2 = getValidPin();
						if (newPin1 == newPin2) {
							ac.setAccountPin(newPin1);
							LOGGER.info("Your New Pin Successfully Update");
							flag1 = false;
						} else {
							LOGGER.warn("PIN MISMATCHED..TRY AGAIN");
						}
					} while (flag1);
					break;
				case 3:
					selectBranch();
					break;
				case 4:
					long newmo = getValidMobileNumber();
					ac.setMobileNumber(newmo);
					LOGGER.info("Your Mobile Number Successfully Update");
					break;
				case 5:
					String newmail = getValidMail();
					ac.setGmail(newmail);
					LOGGER.info("Your Mail Id Successfully Update");
					break;
				case 6:
					LOGGER.info("Enter Your New Address");
					String newadd = getValidAddress();
					ac.setAddress(newadd);
					LOGGER.info("Your Address Successfully Update");
					break;
				case 7:
					getAccountType();
					LOGGER.info("Your Account Type Successfully Update");
					break;
				case 8:
					flag = false;
					break;
				default:
					LOGGER.warn("This Is Not Valid Choice-");
					break;
				}
			} else {
				LOGGER.warn("This Invalid Account Number Or Pin");
			}
		} while (flag);
	}

}
