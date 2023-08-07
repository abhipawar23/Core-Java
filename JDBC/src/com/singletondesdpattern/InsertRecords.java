package com.singletondesdpattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecords {
	public static void main(String[] args) {
		try {

			Connection connection = MyConnection.getConnection();
			String sql1 = "insert into subjects values(?,?,?)";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Subject NUmber");
			int subNo = sc.nextInt();
			System.out.println("Enter Subject Name");
			String subName = sc.next();
			System.out.println("Enter Subject Code");
			long subCode = sc.nextLong();
			PreparedStatement ps = connection.prepareStatement(sql1);
			ps.setInt(1, subNo);
			ps.setString(2, subName);
			ps.setLong(3, subCode);
			ps.execute();

			System.out.println("Records Sucessfully Added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
