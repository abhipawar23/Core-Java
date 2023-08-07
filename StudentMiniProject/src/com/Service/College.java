package com.Service;

import com.model.AllStudent;
import com.model.Student;

public class College {

	public Student addStudentDetails() {

		Student student1 = new Student();
		student1.id = 17;
		student1.Name = "sagar";
		student1.Address = "pune";

		Student student2 = new Student();
		student2.id = 18;
		student2.Name = "Sushant";
		student2.Address = "Solpaur";
		// 1000

		return student2;// id name address

	}

	public AllStudent addAllStudentDetails() {
		AllStudent all = new AllStudent();
		all.s1.id = 101;
		all.s1.Name = "abc";
		all.s1.Address = "Pune";

		all.s2.id = 201;
		all.s2.Name = "xyz";
		all.s2.Address = "pcmc";

		all.s3.id = 301;
		all.s3.Name = "pqr";
		all.s3.Address = "Mumbai";

		return all;// s1,s2,s3

	}

}
