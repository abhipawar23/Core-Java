package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connecion = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String sql = "insert into class values(?,?,?)";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student STD");
			int stc = sc.nextInt();
			System.out.println("Enter Studnet Name");
			String name = sc.next();
			System.out.println("Enter Student Class Room Number");
			long classno = sc.nextLong();
			PreparedStatement ps = connecion.prepareStatement(sql);
			ps.setInt(1, stc);
			ps.setString(2, name);
			ps.setLong(3, classno);
			ps.execute();
			connecion.close();
			System.out.println("Sucessfully Execute");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
