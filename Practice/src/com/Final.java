package com;

public class Final {

	Final() {
		System.out.println("Def Cons");
	}

	public static void main(String[] args) {
		 Final f = new Final();
		f = new Final();
	}
}
