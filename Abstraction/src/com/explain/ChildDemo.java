package com.explain;

public class ChildDemo extends Demo {
	@Override
	protected void childName() {
		System.out.println("abc");
	}
	
	Demo d = new ChildDemo();
	
	
	

}
