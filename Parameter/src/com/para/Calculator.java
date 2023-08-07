 package com.para;

public class Calculator {

	public int add(int i, int j) {
		int addition = i + j;
		System.out.println(addition);
		return addition;
	}

	public int sub(int i, int j)
	{
		int substraction = i - j;
		return substraction;
	}

	public int multi(int i, int j) {
		int multi = i * j; 
		return multi;
	}

	public int divide(int k, int m) {
		int div = k/m;
		return div;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(150, 90);
		//System.out.println("Addition of 2 nos is :" + addition);

		int addition = c.sub(99, 10);
		System.out.println("Substractions of 2 nos is :" + addition);

		int abc = c.multi(2, 6);
		System.out.println("Multiplication of 2 no is :" + abc);

		int div = c.divide(10, 2);
		System.out.println("Divsion of 2 no is :"+ div);
	}

}
