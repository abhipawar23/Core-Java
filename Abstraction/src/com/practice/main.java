package com.practice;

public class main extends TestSub {

	@Override
	public void m1() {
	 
		System.out.println("m1 method implement in main class");
		
	}
	
	
	public void mainClassmethod() {
		
		System.out.println("main class own method");
	}
	
	public static void main(String[] args) {
		Test test = new main();
		test.m1();
		test.buildingName();
		System.out.println(test.buildingNo+"\n");
		
	
		TestSub testsub = new main();
		testsub.m1();                              
		testsub.buildingName();
		System.out.println(testsub.buildingNo);
		testsub.ownerName();
		
		main m = new main();     System.out.println("\n");
		m.m1();
		m.buildingName();
		System.out.println(m.buildingNo);
		m.ownerName();
		m.mainClassmethod();
		
	}
	

}
