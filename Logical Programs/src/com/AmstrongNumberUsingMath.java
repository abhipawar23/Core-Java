package com;

public class AmstrongNumberUsingMath {
	
	public static void main(String[] args) {
		
		int num=153;
		int sum=0,count=0,last=0;
		int temp=num;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;
			sum= sum + (int)Math.pow(last, count);
			temp=temp/10;
		}
		if(sum == num) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("not");
		}
	}

}
