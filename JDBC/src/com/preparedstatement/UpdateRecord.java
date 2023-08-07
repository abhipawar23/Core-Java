package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Name to be Update");
			String name = sc.next();
			System.out.println("Enter Studnet STD");
			int std = sc.nextInt();
			String sql = "update class set name=? where std=? ";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, std);
			ps.executeUpdate();
			connection.close();
			System.out.println("Sucessfully Update");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
