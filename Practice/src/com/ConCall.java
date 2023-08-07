package com;

public class ConCall {

	public static int count = 1;

	ConCall() {

		if (count > 3) {
			System.out.println("It Not Allow Create Object");
		}
		count++;

	}

	final static synchronized strictfp public void main(String... abc) {
		ConCall call1 = new ConCall();
		ConCall call2 = new ConCall();
		ConCall call3 = new ConCall();
		//ConCall call4 = new ConCall();
		System.out.println("Valid Sucess");
		
		Integer i = new Integer(12);
	}
}
