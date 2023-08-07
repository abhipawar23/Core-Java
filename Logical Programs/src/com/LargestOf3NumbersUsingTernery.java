package com;

public class LargestOf3NumbersUsingTernery {
	
//	condition ? iftrue : iffalse
	
	public static void main(String[] args) {
		
		int a=12,b=85,c=32;
		
//		int largest = a>b ? a:b;
//		largest = largest>c ? largest: c;
		
		int largest =(a>b ? a:b) > c ? (a>b ? a:b):c;
		
		System.out.println(largest);
	}

}
