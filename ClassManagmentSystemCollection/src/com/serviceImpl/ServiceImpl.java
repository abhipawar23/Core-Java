package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Cource;
import com.model.Faculty;
import com.model.Student;
import com.service.Service;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class ServiceImpl implements Service {
	List<Cource> cList = new ArrayList<Cource>();
	List<Faculty> fList = new ArrayList<Faculty>();
	List<Batch> bList = new ArrayList<Batch>();
	List<Student> sList = new ArrayList<Student>();

	public static int getValidId() {
		Scanner sc = new Scanner(System.in);
		try {
			int id = sc.nextInt();
			String idInString = String.valueOf(id);
			if (id >= 0 && idInString.length() == 4) {
				return id;
			} else {
				System.out.println("This Is Not Valid Id...\nPlease Enter Four Digit Id:-");
				return getValidId();
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again");
			System.out.println("Enter Id:-");
			return getValidId();
		}
	}

	public static String getValidName() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		if (name.length() < 3) {
			System.out.println("Invalid Name Please Enter At Least Three Character Name \nEnter Valid Name:-");
			return getValidName();
		}
		try {
			Integer i = Integer.parseInt(name);
			System.out.println("This Is Not Valid Name...\nEnter Valid Name:-");
			return getValidName();
		} catch (Exception e) {
			return name;
		}
	}

	public void addCourceDetails() {
		int n = 0;
		System.out.println("Enter How Many Cource You Want To Add");
		Scanner sc = new Scanner(System.in);
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again");
			addCourceDetails();
		}
		for (int i = 1; i <= n; i++) {
			Cource c = new Cource();
			System.out.println("Enter Cource Id");
			int id = getValidId();
			c.setCid(id);

			System.out.println("Enter Cource Name");
			String name = getValidName();
			c.setCname(name);
			cList.add(c);
			System.out.println(String.format("Cource %d is added Successfully", i));
		}
	}

	public void displayCourceDetails() {
		System.out.println("Course Id" + "\t" + "Course Name");
		for (Cource cource : cList) {
			// System.out.println(cource.getCid() + "\t\t" + cource.getCname());
			System.out.println(cource);
		}
	}

	public Faculty matchCourseId(Faculty f) {
		int newid = 0;
		Scanner sc = new Scanner(System.in);
		displayCourceDetails();
		System.out.println("Please Select Cource Id From Abow Menu");
		try {
			int userCourceId = sc.nextInt();
			for (Cource cource : cList) {
				if (userCourceId == cource.getCid()) {
					newid = userCourceId;
					f.setCource(cource);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again\n");
			return matchCourseId(f);
		}
		if (newid == 0) {
			System.out.println("This Course Id Is Not Match....Try Again\n");
			return matchCourseId(f);
		} else {
			return f;
		}
	}

	public void addFacultyDetails() {
		int n = 0;
		System.out.println("Enter How Many Faculty You Want To Add");
		Scanner sc = new Scanner(System.in);
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again");
			addFacultyDetails();
		}
		for (int i = 1; i <= n; i++) {
			Faculty f = new Faculty();
			System.out.println("Enter Faculty Id");
			f.setFid(getValidId());

			System.out.println("Enter Faculty Name");
			f.setFname(getValidName());

			Faculty f1 = matchCourseId(f);

			fList.add(f1);
			System.out.println(String.format("Faculty %d is added Successfully", i));
		}
		System.out.println("All Faculty Addes Succesfully");
	}

	public void displayFacultyDetails() {
		System.out.println("Faculty Id\tFaculty Name\tCourse Name");
		for (Faculty faculty : fList) {
			System.out.println(faculty);
		}
	}

	public Batch matchFacultyId(Batch b) {
		int newid = 0;
		Scanner sc = new Scanner(System.in);
		displayFacultyDetails();
		System.out.println("Select Faculty Id From Abow Menu");
		try {
			int userid = sc.nextInt();
			for (Faculty faculty : fList) {
				if (userid == faculty.getFid()) {
					newid = userid;
					b.setFaculty(faculty);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again\n");
			return matchFacultyId(b);
		}
		if (newid == 0) {
			System.out.println("This Faculty Id Is Not Match...Try Again\n");
			return matchFacultyId(b);
		} else {
			return b;
		}
	}

	public void addBatchDetails() {
		int n = 0;
		System.out.println("Enter How Many Batch You Want TO Add");
		Scanner sc = new Scanner(System.in);
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again");
			addBatchDetails();
		}
		for (int i = 1; i <= n; i++) {
			Batch b = new Batch();
			System.out.println("Enter Batch ID ");
			b.setBid(getValidId());

			System.out.println("Enter Batch Name");
			b.setBname(getValidName());

			Batch b1 = matchFacultyId(b);

			bList.add(b1);
			System.out.println(String.format("Batch %d is added Sucessfully", i));
		}
		System.out.println("All Batch Added Sucessfully");
	}

	public void displayBatchDetails() {
		System.out.println("Batch Id\tBatch Name\tFaculty Name\tCourse Name");
		for (Batch batch : bList) {
			System.out.println(batch);
		}
	}

	public Student matchBatchId(Student s) {
		int newid = 0;
		Scanner sc = new Scanner(System.in);
		displayBatchDetails();
		System.out.println("Please Select Batch Id for Abow Menu");
		try {
			int userid = sc.nextInt();
			for (Batch batch : bList) {
				if (userid == batch.getBid()) {
					newid = userid;
					s.setBatch(batch);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again\n");
			return matchBatchId(s);
		}
		if (newid == 0) {
			System.out.println("This Batch ID Id Not Match...Try Agian\n");
			return matchBatchId(s);
		} else {
			return s;
		}
	}

	public void addStudentDetails() {
		int n = 0;
		System.out.println("Enter How Many Student You Want To Add");
		Scanner sc = new Scanner(System.in);
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("This Is Not Valid Input...Try Again");
			addStudentDetails();
		}
		for (int i = 1; i <= n; i++) {
			Student s = new Student();
			System.out.println("Enter Student Id");
			s.setSid(getValidId());

			System.out.println("Enter Student Name");
			s.setSname(getValidName());

			Student s1 = matchBatchId(s);

			sList.add(s1);
			System.out.println(String.format("Student %d is added Sucessfully", i));
		}
		{
			System.out.println("All Student Added Sucessfully");
		}
	}

	public void displayStudentDetails() {
		System.out.println("Student Id\tStudent Name\tBatch Name\tFaculty Name\tCourse Name");
		for (Student student : sList) {
			System.out.println(student.getSid() + "\t\t" + student.getSname() + "\t" + student.getBatch().getBname()
					+ "\t\t" + student.getBatch().getFaculty().getFname() + "\t\t"
					+ student.getBatch().getFaculty().getCource().getCname());
		}
	}

}
