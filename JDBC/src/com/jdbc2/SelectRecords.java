package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String sql = "select * from employees";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("address"));

//				System.out.println("\n---Using column no---");
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			connection.close();

		} catch (Exception e) {

		}
	}
}
