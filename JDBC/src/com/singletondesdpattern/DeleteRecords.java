package com.singletondesdpattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecords {

	public static void main(String[] args) {
		try {
			Connection connection = MyConnection.getConnection();
			String sql = "delete from subjects where code=?";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Code number You Want to be delete");
			int code = sc.nextInt();
			PreparedStatement pmt = connection.prepareStatement(sql);
			pmt.setInt(1, code);
			pmt.executeUpdate();
			System.out.println("Delete Records Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
