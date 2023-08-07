package com.homework.isa.relation;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("IsaRelation.txt"));
		Address adr = (Address) input.readObject();
		Address adr1 = (Address) input.readObject();
		System.out.println(adr.sId + " " + adr.Sname + " " + adr.ladr + " " + adr.padr + " " + adr.pincode);
		System.out.println(adr1.sId + " " + adr1.Sname + " " + adr1.ladr + " " + adr1.padr + " " + adr1.pincode);
	}

}
