package com.model;

public class Batch {

	private int bid;
	private String bname;
	Faculty faculty;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public String toString() {
		return bid + "\t\t" + bname + "\t\t" + getFaculty().getFname() + "\t\t" + getFaculty().getCource().getCname();

	}
}
