package com.homework.parameter;

public class Student {

	int sid;
	String sname;
	Batch batch;

	public Student(int sid, String sname, Batch batch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
	}

	public static void main(String[] args) {
		Course c = new Course(101, "BCS");
		Faculty f = new Faculty(1, "Science", c);
		Batch b = new Batch(111, "Morning", f);
		Student s = new Student(100, "Abhi", b);

		System.out.println(s.sid + " " + s.sname + " " + s.batch.bid + " " + s.batch.bname + " " + " "
				+ s.batch.faculty.fid + " " + s.batch.faculty.fname + " " + s.batch.faculty.course.cid + " "
				+ s.batch.faculty.course.cname);
	}
}
