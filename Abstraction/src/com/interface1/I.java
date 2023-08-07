package com.interface1;

public interface I {
	
	int i = 10;  //public static final by default
	
	public static final int j = 20;
	
	//jdk 1.7
	public abstract void m1();
	
	void m2(); // all method are abstract and 100% abstraction in interface

}
