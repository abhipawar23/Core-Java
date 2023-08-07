package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String sql = "delete from class where std=?";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter STD You Want To Delete ");
			int std = sc.nextInt();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, std);
			ps.executeUpdate();
			connection.close();
			System.out.println("Sucessfully deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
