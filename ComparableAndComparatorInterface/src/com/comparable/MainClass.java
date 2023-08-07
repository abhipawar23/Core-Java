package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student(100, "Abhi", "Jamkhed");
		Student s1 = new Student(1, "Rushi", "Pune");
		Student s2 = new Student(10, "Sushant", "Solapur");
		List<Student> listOfStudent = new ArrayList<>();
		listOfStudent.add(s);
		listOfStudent.add(s1);
		listOfStudent.add(s2);

		System.out.println("---Before Sorting---");
		for (Student student : listOfStudent) {
			System.out.println(student.id + " " + student.name + " " + student.address);
		}

		System.out.println("\n----After Sorting-----");
		Collections.sort(listOfStudent);
		for (Student student : listOfStudent) {
			System.out.println(student.id + " " + student.name + " " + student.address);
		}
	}
}
