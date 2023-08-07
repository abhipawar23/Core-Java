package com.homework.parameter;

public class Batch {

	int bid;
	String bname;
	Faculty faculty;

	public Batch(int bid, String bname, Faculty faculty) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.faculty = faculty;
	}

	public static void main(String[] args) {
		Course c = new Course(101, "BCS");
		Faculty f = new Faculty(1, "Science", c);
		Batch b = new Batch(111, "Morning", f);

		System.out.println(b.bid + " " + b.bname + " " + b.faculty.fid + " " + b.faculty.fname + " "
				+ b.faculty.course.cid + " " + b.faculty.course.cname);
	}
}
