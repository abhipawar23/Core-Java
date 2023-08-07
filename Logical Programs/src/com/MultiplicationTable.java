package com;

import java.util.Scanner;

public class MultiplicationTable {
	
//	n=2
//	2 * 1 = 2
//	2 * 2 = 4
//	2 * 3 = 6
//	n * i = result 
//	i=1; i<11//i<=10
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			int mul= n*i;
			
			System.out.println(n+" x "+i+" = "+mul);
			
		}
	}

}
