package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try {
			// 1.Register the driver class //load the driver class mysql
			Class.forName("com.mysql.jdbc.Driver");
		
			// 2.Create the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			// 3.to build sql query
			//String sql = ("Insert Into employees values (10,'Abhishek','Pune')");
			String sql1 = "update employees set name='abc' where id=10";
			
			// 4.Create The Statement interface
			Statement smt = connection.createStatement();

			// 5.Execute the sql queries
			// smt.execute(sql);
			smt.execute(sql1);

			// 6.Close The Connection
			connection.close();
			System.out.println("Records Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
