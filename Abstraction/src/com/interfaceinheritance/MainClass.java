package com.interfaceinheritance;

import java.net.Socket;

public class MainClass implements I3 {

	public void m2() {
		System.out.println("I2 interface of m2 method ");
		}

	public void m1() {
		System.out.println("I1 interface of m1 method ");
		}

	public void m3() {
		System.out.println("I3 interface of m3 method");
		}

	
	public void main(String s) {
		System.out.println(s);
	}
	public static void main(String[]args) {
		I1 i1 = new MainClass();     System.out.println("I1 + MainClass object:-");
		i1.m1();
		System.out.println(i1.x);
		
		I2 i2 = new MainClass();     System.out.println("\nI2 + MainClass object:-");
		i2.m1();
		i2.m2();
		System.out.println(x+" "+y);
		
		
		I3 i3 = new MainClass();   System.out.println("\nI3 + MainClass");
		i3.m1();
		i3.m2();
		i3.m3();
		System.out.println(i3.x+" "+i3.y+" "+i3.z);
		
		MainClass main = new MainClass(); System.out.println("\nMainClass objects");
		main.m1();
		main.m2();
		main.m3();
		System.out.println(MainClass.x+" "+MainClass.y+" "+MainClass.z);
		main.main("ABHISHEK");
		
	}

}
