package com;

public class LargestOf3Number {
	
//	12  85  32
	
	public static void main(String[] args) {
		
		int a=12,b=85,c=32;
		
		if(a>b && b>c) {
			System.out.println("a");
		}else if(b>a && b>c) {
			System.out.println("b");
		}else{
			System.out.println("c");
		}
		
	}

}
