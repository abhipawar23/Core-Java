package com;

import java.util.Scanner;

public class PowerOfNumber {
	
//	2^3==2*2*2
//	mul = 1*2 i=1
//	mul = 2*2 i=2
//	mul = 4*2 i=3
	
//	2^4==2*2*2*2
//	a,b c
	public static void main(String[] args) {
		
		int a=2,b=3,mul=1;
		
		for(int i=1;i<=b;i++) {
//			mul = mul * a ;
			mul *= a;
		}
		
		System.out.println(mul);
		
	}

}
