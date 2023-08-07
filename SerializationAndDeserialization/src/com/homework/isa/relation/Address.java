package com.homework.isa.relation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Address extends Student {

	String ladr;
	String padr;
	int pincode;

	public Address(int sId, String sname, String ladr, String padr, int pincode) {
		super(sId, sname);
		this.ladr = ladr;
		this.padr = padr;
		this.pincode = pincode;
	}

	public static void main(String[] args) throws IOException {
		//Student s = new Student(10, "ABhi");

		Address adr = new Address(11, "Shiv", "Pune", "Jamkhed", 413204);
		Address adr1 = new Address(12,"Abhi","Nagar","Jamkhed",23122);
	//	System.out.println(adr.sId + " " + adr.Sname + " " + adr.ladr + " " + adr.padr + " " + adr.pincode);
		FileOutputStream file = new FileOutputStream("IsaRelation.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(adr);
		out.writeObject(adr1);
		out.close();
		System.out.println("Done it !!");
	}
}
