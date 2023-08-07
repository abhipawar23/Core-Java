package com.student;

public class Data {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Abhi");
		s1.setAddress("Nagar");
		s1.setMarks(90.80f);

		Student s2 = new Student();
		s2.setId(21);
		s2.setName("Shiv");
		s2.setAddress("pune");
		s2.setMarks(90.8110f);

		System.out.println("---Student Details---");
		System.out.println(s1);
		System.out.println(s2 + "\n");

		String x = s1.toString();
		System.out.println(x);
		String x1 = s2.toString();
		System.out.println(x1 + "\n");

		System.out.println("Student 1 No Details");
		System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getAddress() + " " + s1.getMarks());
		System.out.println("Student 2 No Details");
		System.out.println(s2.getId() + " " + s2.getName() + " " + s2.getAddress() + " " + s2.getMarks());

		System.out.println("\nApartmet class start");
		Apartment a1 = new Apartment();
		a1.setFlatenumber(1010);
		a1.setFlateowner("suresh");
		a1.setBuilding('Q');
		Apartment a2 = new Apartment();
		a2.setFlatenumber(1111);
		a2.setFlateowner("Prasad");
		a2.setBuilding('P');

		System.out.println(a1.getFlatenumber() + " " + a1.getFlateowner() + " " + a1.getBuilding());
		System.out.println(a2.getFlatenumber() + " " + a2.getFlateowner() + " " + a2.getBuilding());

		System.out.println("\n" + a1);
		System.out.println(a2);

		String b = a1.toString();
		System.out.println("\n"+b);
		String b1 = a2.toString();
		System.out.println(b1);

	}
}
