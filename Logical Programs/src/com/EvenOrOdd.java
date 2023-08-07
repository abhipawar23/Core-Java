package com;

import java.util.Scanner;

public class EvenOrOdd {
	
//	2,4,6,44444
	
//	n % 2 = 0
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("This number is Even");
		}else {
			System.out.println("Odd number !");
		}
		
	}

}
