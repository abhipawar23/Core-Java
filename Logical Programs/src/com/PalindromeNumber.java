package com;

import java.util.Scanner;

public class PalindromeNumber {
	
//	121 --- 121
//	nitin --- nitin
//	123321 --- 123321
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		int userNum=num;
		
		int rev=0;
		
		while(num != 0) {
			rev= rev*10 + num%10;
			num=num/10;
		}
//		num=0 
		if(userNum == rev) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It's not palindrome");
		}
		
	}
	
	

}
