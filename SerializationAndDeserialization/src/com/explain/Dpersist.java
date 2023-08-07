package com.explain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dpersist {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));

		Employee emp = (Employee) in.readObject();
		System.out.println(emp.eid + " " + emp.ename + " " + emp.salary);

	}
}
