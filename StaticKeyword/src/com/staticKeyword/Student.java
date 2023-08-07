package com.staticKeyword;

public class Student {
//static keyword is use for memory management
	int rollNo;
	String name;
	// 1000
	public static String collegeName = "DYP";

//	@Override
	//public String toString() {
		// TODO Auto-generated method stub
		//return rollNo + " " + name + " " + collegeName;
	//}

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.rollNo = 201;
		s1.name = "abc";
		System.out.println(collegeName);
		s1.collegeName = "PCCOE";
    	//System.out.println(collegeName);

		System.out.println(s1.rollNo+" "+s1.name+" "+collegeName);

		Student s2 = new Student();
		s2.rollNo = 202;
		s2.name = "pqr";
		System.out.println(s2.rollNo + " " + s2.name + " " + Student.collegeName);

	}

}