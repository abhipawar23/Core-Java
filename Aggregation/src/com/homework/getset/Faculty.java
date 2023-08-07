package com.homework.getset;

public class Faculty {

	int fid;
	String fname;
	Course course;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	public static void main(String[] args) {
		Course c = new Course();
		c.setCid(1);
		c.setCname("MBA");
		
		Faculty f = new Faculty();
		f.setFid(100);
		f.setFname("SCIENCE");
		f.setCourse(c);
	System.out.println(f.getFid()+" "+f.getFname()+" "+f.getCourse().getCid()+" "+f.getCourse().getCname());
	}
}
