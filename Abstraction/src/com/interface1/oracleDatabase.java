package com.interface1;

public class oracleDatabase implements MyDatabase {

	public void commite() {
		System.out.println("Oracle Database for commite method");

	}

	public void rollBack() {
		System.out.println("oracle database for rollback method");

	}

	public void m2() {
		System.out.println("m2 method of oracle database");
	}
	
	public static void main(String[] args) {
		MyDatabase x = new oracleDatabase();
		x.commite();
		x.rollBack();  System.out.println("\n");
		
		oracleDatabase y = new oracleDatabase();
		y.commite();
		y.rollBack();
		y.m2();
		System.out.println(i);
	}
}
