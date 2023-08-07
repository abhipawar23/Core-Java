package com.explain;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static final Logger LOGGER = LogManager.getLogger(Demo.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;

		LOGGER.debug("Main Method Started");

		LOGGER.info("Enter Your Age");
		try {
			age = sc.nextInt();
		} catch (Exception e) {
			LOGGER.error("This Is Not Valid Input");
		}
		if (age >= 18) {
			LOGGER.info("User Is Allow To Voter ID Card");
		} else {
			LOGGER.warn("User Is Not Allow To Voter ID Card");
		}

		LOGGER.debug("Main Method Ended");
	}
}
