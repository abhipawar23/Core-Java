package com.comparable;

public class Student implements Comparable<Student> {

	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id == o.id) {
			return 0;
		} else {
			return -1;
		}

	}
}
  //1 id>o.id = 1
  //0 id==o.id= 0
  //-1 id<o.id= -1