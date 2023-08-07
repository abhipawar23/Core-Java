package com;

public class NumberOfDigit {
	
//	45679  digit=5
//	 7899  digit=4
//	7899/10=789/10=78/10=7/10=0
	
	public static void main(String[] args) {
		
		int num=45698;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		System.out.println(count);
		
	}

}
