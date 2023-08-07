package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String drop = "drop table employees";

			Statement smt = connection.createStatement();

			smt.execute(drop);

			connection.close();
			System.out.println("Drop table Successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
