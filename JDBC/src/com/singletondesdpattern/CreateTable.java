package com.singletondesdpattern;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "create table subjects(Number int,Subject_Name varchar(50),code long) ";
			Statement smt = connection.createStatement();
			smt.execute(sql);
			connection.close();
			System.out.println("Table Created Sucessfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
