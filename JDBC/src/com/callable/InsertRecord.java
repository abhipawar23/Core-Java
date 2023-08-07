package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) {
		try {

			Connection connection = MyConnection.getConnection();
			String sql = "{call insert_student(?,?,?)}";
			CallableStatement cs = connection.prepareCall(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Id");
			int id = sc.nextInt();
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Address");
			String adr = sc.next();
			
			cs.setInt(1, id);
			cs.setString(2, name);
			cs.setString(3, adr);
			cs.execute();
			System.out.println("Record Inserted Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
