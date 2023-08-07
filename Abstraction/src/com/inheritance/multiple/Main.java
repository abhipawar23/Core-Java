package com.inheritance.multiple;

public class Main implements I1, I2 {

	public void show() {
		System.out.println("show method of I1,I2");

	}

	public static void main(String[] args) {
		I1 i1 = new Main();
		i1.show();

		I2 i2 = new Main();
		i2.show();

	}

}
