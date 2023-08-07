package com.interface1;

public class MySqlDatabase implements MyDatabase {

	public void commite() {
		System.out.println("commite method of my sql database class");

	}

	public void rollBack() {
		System.out.println("rollback method of my sql database class");

	}

	public static void main(String[]args) {
		MyDatabase data = new MySqlDatabase();
		data.commite();
		data.rollBack();
		
		MySqlDatabase database = new MySqlDatabase();
		database.commite();
		database.rollBack();
	}
}
