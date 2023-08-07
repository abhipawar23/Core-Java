package com;

public class Demo {

	public static void main(String[] args) {

		String ex = "Exponent";
		StringBuffer s = new StringBuffer(ex);
		StringBuffer s1 = s.reverse();
		System.out.println(s1);

		StringBuilder sb = new StringBuilder();
		sb.append(ex);
		System.out.println(sb.reverse());
	}

}
