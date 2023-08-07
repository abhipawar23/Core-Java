package com.explian;

public class Test {

	public static void main(String[] args) {
		Address adr = new Address("pune", "Jamkhed", 413204);// Address Class

		Student s1 = new Student(10, "ABhi", adr);// Student Class
		Student s2 = new Student(20, "Shiv", adr);

		System.out.println(
				s1.sId + " " + s1.name + " " + s1.address.ladr + " " + s1.address.padr + " " + s1.address.pinCode);
		System.out.println(
				s2.sId + " " + s2.name + " " + s2.address.ladr + " " + s2.address.padr + " " + s2.address.pinCode);

		Address adr1 = new Address("nagar", "Sarola", 261786);
		Student s3 = new Student(30, "Adi", adr1);
		System.out.println(
				s3.sId + " " + s3.name + " " + s3.address.ladr + " " + s3.address.padr + " " + s3.address.pinCode);

	}

}