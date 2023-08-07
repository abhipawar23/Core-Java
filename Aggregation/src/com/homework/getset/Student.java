package com.homework.getset;

public class Student {

	int sid;
	String sname;
	Batch batch;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
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

		Student s = new Student();
		s.setSid(1);
		s.setSname("ABHishek");
		s.setBatch(b);

		System.out.println(s.getSid() + " " + s.getSname() + " " + s.getBatch().getBid() + " " + s.getBatch().getBname()
				+ " " + s.getBatch().getFaculty().getFid() + " " + s.getBatch().getFaculty().getFname() + " "
				+ s.getBatch().getFaculty().getCourse().getCid() + " "
				+ s.getBatch().getFaculty().getCourse().getCname());
		
		
	}
}
