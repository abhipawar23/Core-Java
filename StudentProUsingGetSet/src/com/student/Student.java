package com.student;

public class Student {

	private int id;
	private String name;
	private String address;
	private float marks;

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String abc) {
		name = abc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String xyz) {
		address = xyz;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float x) {
		marks = x;
	}

	public String student(String student) {
		return student;
	}
	
}
