package com.explain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	public static final Logger LOGGER = LogManager.getLogger(Test.class);

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		LOGGER.info("Main Method Started");
		int i = 10 / 0;
		System.out.println("Main Method Ended");
		LOGGER.info("Main Method Ended");
	}
}
