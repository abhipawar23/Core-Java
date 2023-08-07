package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			String createTable = "create table employees(id int,name varchar(50),address varchar(50))";
//			String createTable2 = "create table students(id int,name varchar(50),address varchar(50))";
//			String createTable3 = "create table class(std int,name varchar(60),classnum long)";
			
			Statement smt = connection.createStatement();
			
			smt.execute(createTable);
//			smt.execute(createTable2);
//			smt.execute(createTable3);
//			
			connection.close();
			System.out.println("Record Inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
