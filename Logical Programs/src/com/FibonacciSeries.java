package com;

import java.util.Scanner;

public class FibonacciSeries {
	
//	0 1 1 2 3 5 8 13
//	0+1=1
//	  1+1=2
//	    2+2=3
//	f+s=t-------------f=0,s=1,t=1
//	                      f=1,s=1,t=2
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number upto which you want fab series : ");
		int n=sc.nextInt();
		int f=0;
		int s=1,t;
		System.out.println("Fab series : ");
		System.out.print(f+" "+s);
		for(int i=2;i<n;i++) {
			t = f+s;
			System.out.print(" "+t+" ");
			f=s;
			s=t;
		}
	}

}
