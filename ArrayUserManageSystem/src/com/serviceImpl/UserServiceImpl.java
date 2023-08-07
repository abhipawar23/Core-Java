package com.serviceImpl;

import java.util.Scanner;

import com.model.User;
import com.service.UserService;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class UserServiceImpl implements UserService {
	User[] userarray = new User[10];
	User user = new User();

	public void userDetails() {
		System.out.println("HOW MANY USER DATA STORE");
		Scanner sc = new Scanner(System.in);
		int add = 0;
		try {
			add = sc.nextInt();
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again");
			userDetails();
		}
		for (int i = 1; i <= add; i++) {
			User user = new User();

			String name = getValidName();
			user.setName(name);

			int id = getValidId();
			user.setId(id);

			String address = getValidAddress();
			user.setAddress(address);

			long mobile = getValidMobileNumber();
			user.setMobileNo(mobile);

			String mail = getValidMail();
			user.setMail(mail);

			int age = getValidAge();
			user.setAge(age);

			String gender = getValidGender();
			user.setGender(gender);

			int pin = getValidPin();
			user.setPin(pin);
			userarray[i] = user;
			System.out.println(String.format("User %d Data Stored Sucessfully", i));
		}
	}

	public void displayUserDetails() {
		for (User user : userarray) {
			if (user != null) {
				System.out.println(user + "\n");
			}
		}
	}

	public void deleteUSerDetails() {
		int index = 0;
		int id = 0;
		Scanner sc = new Scanner(System.in);
		displayUserDetails();
		System.out.println("Enter User Id You Want To Delete");
		try {
			id = sc.nextInt();
			for (User user : userarray) {
				if (user != null && user.getId() == id) {
					userarray[index] = null;
					System.out.println("User Imformation Delete Sucessfully...");
					break;
				}
				index++;
			}

		} catch (Exception e) {
			System.out.println("This Is Not Valid Input....Try Again\n");
			deleteUSerDetails();
		}
		if (index == 10) {
			System.out.println("This User Id Is Not Match...Try Again\n");
			deleteUSerDetails();
		}
	}

	public void updateUSerDetails() {
		boolean flag = true;
		int choice = 0;
		int id = 0;
		int vid = 0;
		Scanner sc = new Scanner(System.in);
		displayUserDetails();
		System.out.println("Enter User Id You Want To Update");
		try {
			id = sc.nextInt();
			for (User user : userarray) {
				if (user != null && user.getId() == id) {
					vid = id;
					do {
						System.out.println(
								"1.Change Name\n2.Change Address\n3.Change Mobile Number\n4.Change Mail\n5.Change Age\n6.Change Gender\n7.Change Pin\n8.Exit The Menu");
						System.out.println("Enter Your Choice");

						choice = sc.nextInt();
						switch (choice) {
						case 1:
							String name = getValidName();
							user.setName(name);
							break;
						case 2:
							String address = getValidAddress();
							user.setAddress(address);
							break;
						case 3:
							long mobile = getValidMobileNumber();
							user.setMobileNo(mobile);
							break;
						case 4:
							String mail = getValidMail();
							user.setMail(mail);
							break;
						case 5:
							int age = getValidAge();
							user.setAge(age);
							break;
						case 6:
							String gender = getValidGender();
							user.setGender(gender);
							break;
						case 7:
							int pin = getValidPin();
							user.setPin(pin);
							break;
						case 8:
							flag = false;
							System.out.println("User Want TO Stop Update Details");
							break;
						default:
							System.out.println("This is Not Valid Input");
							break;
						}
					} while (flag);
				}
			}
			if (vid == 0) {
				System.out.println("This Id Is Not Match...Try Again\n");
				updateUSerDetails();
			}
		} catch (Exception e) {
			System.out.println("Invalid Input ...Try Again\n");
			updateUSerDetails();
		}
	}

	private String getValidName() {
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		try {
			name = sc.nextLine();
			Integer i = Integer.parseInt(name);
			System.out.println("This Is Not Valid Name...Try Again\n");
			return getValidName();
		} catch (Exception e) {
			if (name.length() > 3) {
				return name;
			}
			System.out.println("Please Enter Greater Than 3 Char Name\n");
			return getValidName();
		}
	}

	private int getValidId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id");
		try {
			int id = sc.nextInt();
			String idInString = String.valueOf(id);
			if (id > 0 && idInString.length() == 4) {
				return id;
			} else {
				System.out.println("Please Enter Four Digit Id");
				return getValidId();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Id...Please Enter Number Id\n");
			return getValidId();
		}
	}

	private String getValidAddress() {
		String address = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Address");
		try {
			address = sc.next();
			Integer i = Integer.parseInt(address);
			System.out.println("This Is Not Valid Address...Try Again\n");
			return getValidAddress();
		} catch (Exception e) {
			if (address.length() >= 4) {
				return address;
			}
			System.out.println("Please Enter Greater Than 4 Char Address...\n");
			return getValidAddress();
		}
	}

	private long getValidMobileNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number");
		try {
			long mobilenum = sc.nextLong();
			String mobileInString = String.valueOf(mobilenum);
			if (mobilenum > 0 && mobileInString.length() == 10 && (mobileInString.startsWith("7")
					|| mobileInString.startsWith("8") || mobileInString.startsWith("9"))) {
				return mobilenum;
			} else {
				System.out.println(
						"This Is Not Valid Mobile Number...\nPlease Enter 10 Digit Number It Should Be Start with 7,8 OR 9 \n");
				return getValidMobileNumber();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input");
			return getValidMobileNumber();
		}
	}

	private String getValidMail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mail");
		try {
			String mail = sc.next();
			if (mail.endsWith("@gmail.com") || mail.endsWith("@yahoo.com")) {
				return mail;
			} else {
				System.out.println(
						"This Is Not Valid Mail Id...\nEnter Valid Mail Id It Should Be Ends With @gmail.com OR @yahoo.com");
				return getValidMail();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Mail Id");
			return getValidMail();
		}
	}

	private int getValidAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		try {
			int age = sc.nextInt();
			String ageInString = String.valueOf(age);
			if (age > 0 && ageInString.length() == 2) {
				return age;
			} else {
				System.out.println("This Is Not Valid Age...Enter 2 Digit Age");
				return getValidAge();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Age...Try Again");
			return getValidAge();
		}
	}

	private String getValidGender() {
		int gender = 0;
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Gender");
		System.out.println("1.MALE");
		System.out.println("2.FEMALE");
		try {
			gender = sc.nextInt();
			switch (gender) {
			case 1:
				return "Male";
			case 2:
				return "Female";
			default:
				System.out.println("This Is not Valid Input\n");
				return getValidGender();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...\n");
			return getValidGender();
		}

	}

	private int getValidPin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin");
		try {
			int pin = sc.nextInt();
			String pinInString = String.valueOf(pin);
			if (pin > 0 && pinInString.length() == 4) {
				return pin;
			} else {
				System.out.println("Please Enter 4 Digit Pin");
				return getValidPin();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...\n");
			return getValidPin();
		}

	}
}
