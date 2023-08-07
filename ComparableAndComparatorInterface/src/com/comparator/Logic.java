package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {

	public static void main(String[] args) {

		Student s1 = new Student(10, "Abhi", "Jamkhed");
		Student s2 = new Student(10, "Ashish", "Satara");
		Student s3 = new Student(6, "Sushant", "Solapur");
		Student s4 = new Student(1, "Shiv", "Pune");
		Student s5 = new Student(8, "Radhe", "Nagar");

		List<Student> listOfStudent = new ArrayList<>();
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);

		System.out.println("---Before Sorting---");
		for (Student student : listOfStudent) {
			System.out.println(student);
		}

		System.out.println("\n---Studnet Sorting Using Id---");
		Collections.sort(listOfStudent, new SortByStudentUsingId());
		for (Student student : listOfStudent) {
			System.out.println(student);
		}
		System.out.println("\n---Student Sorting Using Name---");
		Collections.sort(listOfStudent, new SortByStudentUsingName());
		for (Student student : listOfStudent) {
			System.out.println(student);
		}
		System.out.println("\n---Studnet Sorting Using Id && Name---");
		Collections.sort(listOfStudent, new SortByStudentUsingIdName());
		for (Student student : listOfStudent) {
			System.out.println(student);
		}
	}
}
