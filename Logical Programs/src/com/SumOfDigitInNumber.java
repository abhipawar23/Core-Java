package com;

public class SumOfDigitInNumber {
	
//	45698 == 4 + 5 + 6 + 9 + 8 = 32
//	45698 % 10 = 8   45698/10=4569
//	4569%10= 9       4569/10=456
	
	public static void main(String[] args) {
		
		int num= 45698;
		
		int sum=0;
		
		while(num>0) {
			sum=sum+(num%10);//8+9=17 
			num= num/10;
		}
		System.out.println(sum);
	}

}
