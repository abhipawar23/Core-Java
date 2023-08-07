package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String employe1 = "insert into employees values(10,'Abhishek','Ahmednagar')";
			String student1 = "insert into students values(100,'Shiv','Pune')";
			String employe2 = "insert into employees values(11,'Ashish','Satara')";
			String employe3 = "insert into employees values(200,'Rushi','Jalana')";
			String class1 = "insert into class values (10,'Vijay',8087271717)";

			Statement smt = connection.createStatement();

			smt.execute(employe1);
			smt.execute(student1);
			smt.execute(employe2);
			smt.execute(employe3);
			smt.execute(class1);

			System.out.println("Records Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Connection connection = null;
				connection.close();
			} catch (Exception e1) {
			}

		}
	}

}
