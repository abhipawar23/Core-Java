package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class DeleteRecords {

	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "{call delete_student(?)}";
			CallableStatement cs = connection.prepareCall(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Name You Want TO Delete");
			String name = sc.next();
			cs.setString(1, name);
			cs.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
