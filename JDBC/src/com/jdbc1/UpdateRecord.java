package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {

		Connection connection = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String update1 = "update students set name='Pawar'where id=100";
			String update2 = "update class set name='ABHISHEK' where std=10";
			Statement s = connection.createStatement();
			s.execute(update1);
			s.execute(update2);

			System.out.println("Update Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {

			}

		}

	}
}
