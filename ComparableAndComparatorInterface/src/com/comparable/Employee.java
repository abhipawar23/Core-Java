package com.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String address;

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
		return id + " " + name + " " + address;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id == o.id) {
			return 0;
		} else {
			return -1;
		}
	}

}
