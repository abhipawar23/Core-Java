package com;

import java.util.Scanner;

public class PrimeNumber {
	
//	23 % i != 0  1--23
//	12 % 2 == 0 not prime
//	9 % 3 == 0 not prime
//	n % (i=2;i<n/2) == 0 not prime
//	16 % 2,3,4,5,6,7,8......
//	7 % 2,3,3
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();//7
		int m=n/2; // 3
		int count=0;
		
		for(int i=2;i<=m;i++) {
			if(n % i == 0 ) { // 12%2==0 true>> count=1; 7%2!=0 false>> 7%3!=0 flase
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
