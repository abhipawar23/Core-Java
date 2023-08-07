package com;

import java.util.Scanner;

public class ReverseNumber {
	
//	num        rev
//	1234 >>>>> 4321
//	1234 % 10 ==== 4  -----4
//	123 % 10 ==    3   --- 43
//	12% 10 ======= 2       432
//	1 %10          1  
	
//   4  3  2  1  == 4000 == 4321 
//	4* 1000
//	3* 100
//	2* 10
//	1* 1
	
	
//	num    = 1234
//	num/10 = 123
//	num/10 = 12
//	num/10 = 1
//	num/10 = 0
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num=sc.nextInt();
		
		int rev =0;
		
		while(num != 0 )
		{
			rev=rev * 10 + num % 10;  // 0 * 10 + 4 == 4  // 4 * 10 + 3 == 43  // 43*10+2 =432
			num = num / 10;             //123               //12                 //1
			
		}
		
		
		
		System.out.println("reverse "+ rev);
		
	}

}
