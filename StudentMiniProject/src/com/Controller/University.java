package com.Controller;
import com.model.AllStudent;
import com.model.Student;
import com.Service.College;


public class University {
	public static void main(String[] args) {
		College college = new College();
		Student s = college.addStudentDetails();
		
		System.out.println("------------Student Details--------------------------");
		System.out.println(s.id + " " + s.Name + " " + s.Address);
		
		System.out.println(" ----------------ALL Student Details-------------");
		
		AllStudent allStudent = college.addAllStudentDetails();
		
		System.out.println(allStudent.s1.id + " " + allStudent.s1.Name + " " + allStudent.s1.Address);
		System.out.println(allStudent.s2.id + " " + allStudent.s2.Name + " " + allStudent.s2.Address);
		System.out.println(allStudent.s3.id + " " + allStudent.s3.Name + " " + allStudent.s3.Address);
		
	
	}

	
		
		
	}

