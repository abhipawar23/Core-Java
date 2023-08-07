package com.explain;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee();
		emp.setEid(10);
		emp.setEname("ABHISHEK");
		emp.setSalary(45000);

		FileOutputStream fos = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(emp);
		out.close();
		System.out.println("Success...");
	}
}
