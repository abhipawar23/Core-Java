package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecords {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String sql = "update employees set name='Shivprasad'where id=10";
			

			Statement smt = connection.createStatement();

			int countUpdate = smt.executeUpdate(sql);
			System.out.println("Update Records:" + countUpdate + "\nRecords Update Sucessfully");
			
			connection.close();

		} catch (Exception e) {

		}
	}
}
