package com.studentmgtsystem;

import java.util.List;

public class University {

	public static void main(String[] args) {
		College clg = new College();

		List<Student> listofstudent = clg.allStudentDetails();
		for (Student s : listofstudent) {
			System.out.println(s);
		}
	}
	
}
