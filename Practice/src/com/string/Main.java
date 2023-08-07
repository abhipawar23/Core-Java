package com.string;

public class Main {

	public static void main(String[] args) {

		// create object of Immutable
//		Immutable obj = new Immutable("Programiz", 2011);
//
//		System.out.println("Name: " + obj.getName());
//		System.out.println("Date: " + obj.getDate());
//
		String s = "the name is abhi";
//		String s1 = s.replace('a', 'z');
//		System.out.println(s1);
		String z = s.replaceAll("name", "aaa");
		System.out.println(z);
		
		StringBuffer ss = new StringBuffer();
	}
}
