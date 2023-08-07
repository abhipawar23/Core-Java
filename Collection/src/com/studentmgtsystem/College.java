package com.studentmgtsystem;

import java.util.ArrayList;
import java.util.List;

public class College {

	public List<Student> allStudentDetails() {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("ABHISHEK");
		s1.setAddress("NAGAR");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("SHIV");
		s2.setAddress("PUne");

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);

		return studentList;

	}
}
