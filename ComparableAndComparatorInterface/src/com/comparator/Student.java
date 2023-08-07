package com.comparator;

public class Student {

	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return id + " " + name + " " + address;

	}

}
