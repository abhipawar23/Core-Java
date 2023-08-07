package com.homework.parameter;

public class Faculty {

	int fid;
	String fname;
	Course course;
	public Faculty(int fid, String fname, Course course) {
		this.fid = fid;
		this.fname = fname;
		this.course = course;
	}
	
	public static void main(String[] args) {
		Course c=new Course(101,"BCS");
		
		Faculty f =new Faculty(1,"Science",c);
		
		System.out.println(f.fid+" "+f.fname+" "+f.course.cid+" "+f.course.cname);
	}
}
