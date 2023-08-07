package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetSingalStudent {

	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "{call get_singal_student(?)}";
			CallableStatement cs = connection.prepareCall(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Name");
			String name = sc.next();
			cs.setString(1, name);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
