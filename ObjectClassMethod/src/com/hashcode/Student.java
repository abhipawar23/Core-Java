package com.hashcode;

public class Student {

	public int id = 10;

	public String name = "Abhi";

	public String address = "Pune";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2= new Student();
		System.out.println(s2.hashCode());
	}
}
