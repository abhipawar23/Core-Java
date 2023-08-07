package com.callable;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private static Connection con = null;

	private MyConnection() {

	}

	public static Connection getConnection() {

		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callable", "root",
						"root");
				return con;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
