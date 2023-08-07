package com.homework.getset;

public class Batch {

	int bid;
	String bname;
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

	public static void main(String[] args) {
		Course c = new Course();
		c.setCid(1);
		c.setCname("MBA");

		Faculty f = new Faculty();
		f.setFid(100);
		f.setFname("SCIENCE");
		f.setCourse(c);

		Batch b = new Batch();
		b.setBid(101);
		b.setBname("Evening");
		b.setFaculty(f);

		System.out.println(
				b.getBid() + " " + b.getBname() + " " + b.getFaculty().getFid() + " " + b.getFaculty().getFname() + " "
						+ b.getFaculty().getCourse().getCid() + " " + b.getFaculty().getCourse().getCname());
	}
}
