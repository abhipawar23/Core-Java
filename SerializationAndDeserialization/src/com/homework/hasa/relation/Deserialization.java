package com.homework.hasa.relation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream("HasaRelation.txt"));
		Employee x = (Employee) obj.readObject();
		System.out.println(x.getEid() + " " + x.getEname() + " " + x.getDepartment().getDeptname());

	}
}
