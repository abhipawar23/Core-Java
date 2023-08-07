package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecords {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String sql = "delete from class where std=10";

			Statement smt = con.createStatement();

			int count = smt.executeUpdate(sql);
			System.out.println("count is:" + count + "\n Record Deleted Sucessfully");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
