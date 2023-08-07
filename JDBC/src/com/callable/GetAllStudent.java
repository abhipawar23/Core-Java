package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class GetAllStudent {
	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "{call get_all_student()}";
			CallableStatement cs = connection.prepareCall(sql);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
