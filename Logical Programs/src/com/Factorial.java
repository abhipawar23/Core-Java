package com;

import java.util.Scanner;

public class Factorial {
	
//	factorial of n number
	
//	5! = 1*2*3*4*5
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			
//			fact= fact*i;
			fact *= i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
		
	}

}