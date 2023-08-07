package com.singletondesdpattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecords {

	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "update subjects set sub_name=? where number=?";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Subject Name To be Updated");
			String subName = sc.next();
			System.out.println("Enter subject Number");
			int subNO = sc.nextInt();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, subName);
			ps.setInt(2, subNO);
			ps.executeUpdate();
			System.out.println("Records Update sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
