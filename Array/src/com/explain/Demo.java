package com.explain;

public class Demo {

	public static void main(String[] args) {
		String[] array = { "abhi", "shiv", "adi", "shubham" };
		System.out.println(array.length);

		System.out.println("By Using For Loop");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("By Using For Each Loop");
		for (String s : array) {
			System.out.println(s);
		}
		char[] arrayChar = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(arrayChar.length);
		char c = arrayChar[2];
		System.out.println("value of 2 index is " + c);

		for (char x : arrayChar) {
			System.out.println(x);
		}
	}
}
