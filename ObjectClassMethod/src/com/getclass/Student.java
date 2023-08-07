package com.getclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Student {

	public void m1() {

	}

	public static void main(String[] args) {

		Student student = new Student();
		System.out.println(student.getClass());

//		Object object = new Object();
//		System.out.println(object.getClass());
//
//		String string = new String();
//		System.out.println(string.getClass());

		Class c = student.getClass();
		Constructor[] c1 = c.getConstructors();
		for (Constructor con : c1) {
			System.out.println(con);
		}
	}
}
