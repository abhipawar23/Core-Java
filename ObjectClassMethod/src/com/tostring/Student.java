package com.tostring;

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {

		Student student = new Student();
		System.out.println(student);
		System.out.println(student.toString());
	}
}
