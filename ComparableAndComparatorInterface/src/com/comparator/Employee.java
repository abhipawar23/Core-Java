package com.comparator;

public class Employee {
	int eid;
	String ename;
	double esalary;

	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public String toString() {
		return eid + " " + ename + " " + esalary;
	}
}
