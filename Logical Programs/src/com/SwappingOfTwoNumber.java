package com;

public class SwappingOfTwoNumber {
	
//	a=45    b=21
//	a=21    b=45
	
//	using third variable
	
	public static void main(String[] args) {
		
		int a=45;
		int b=21;
		int c;
		
		System.out.println("a = "+ a+"\nb = "+b);
		System.out.println("--------------------");
		
		c=a;// c=45       //a=45,b=21,c=45
		a=b;//a=21,b=21,c=45
		b=c;//a=21,b=45,c=45
		
		System.out.println("a = "+ a+"\nb = "+b);
	}

}
