package com.equals;

public class Student {

	int id = 10;

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("sdfhj");
	}
}
