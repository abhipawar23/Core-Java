package com;

class Zz {

	public static void main(String[] args) {

		String s1 = "apple";
		String s2 = "palep";

		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();

		if (s3.length() == s4.length()) {

			System.out.println("String Is Anagram");

		} else {

			System.out.println("String Is Not Anagram");

		}

	}

}