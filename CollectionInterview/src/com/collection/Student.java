package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Student {

	private int sid;

	private String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Student student = new Student(16, "Abhi");
		Student student2 = new Student(31, "King");
//		Student student3 = new Student(12, "King");
//		Student student4 = new Student(13, "King");
//		Student student5 = new Student(10, "Abhi");
//		Student student6 = new Student(25, "King");
//		Student student7 = new Student(12, "King");
//		Student student8 = new Student(13, "King");
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
//		System.out.println(student3.hashCode());
//		System.out.println(student4.hashCode());
		boolean f = student.equals(student2);
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(student, 111);
		map.put(student2, 11);
		System.out.println(map.hashCode());
		System.out.println(map.size());

		// System.out.println(map.size() + "---");
	}

}
