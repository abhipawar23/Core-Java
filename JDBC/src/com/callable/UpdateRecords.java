package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class UpdateRecords {

	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "{call update_student(?,?)}";
			CallableStatement cs = connection.prepareCall(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name You Want Update");
			String name = sc.next();
			System.out.println("Enter Studnet Id ");
			int id = sc.nextInt();
			cs.setString(2, name);
			cs.setInt(1, id);
			cs.executeUpdate();
			System.out.println("Update Record Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
