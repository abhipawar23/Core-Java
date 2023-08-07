package com;

import java.util.Scanner;

public class AdditionNth {
	
	//Addition till nth >>5 
	//1+2+3+4+5=15  sum
//	1+2+3=6
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		int sum=0;
		
		
		for(int i=1; i<=n;i++) {
			
			sum += i;//sum = sum+i	//i==1   sum = 0+1; //i==2 sum=1+2
		}
		
		System.out.println("Sum Is "+sum);
	}

}
