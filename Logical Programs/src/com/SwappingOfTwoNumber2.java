package com;

public class SwappingOfTwoNumber2 {
	
//	a=45    b=21
//	a=21    b=45
	
//	not using third variable
	
	public static void main(String[] args) {
		
		int a=45;
		int b=21;
		
		System.out.println("a = "+ a+"\nb = "+b);
		System.out.println("--------------------");
		
		a = a + b;//a = 45 + 21 //a=66 , b=21
		b = a - b;//b = 66 - 21 //a=66 , b=45
		a = a - b;//a = 66 - 45 //a=21 , b=45
		
		System.out.println("a = "+ a+"\nb = "+b);
		
	}

}
