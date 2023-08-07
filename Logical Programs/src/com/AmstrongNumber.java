package com;
import java.util.Scanner;
import java.util.*;
public class AmstrongNumber {
//	153 = count=3
//	1^3 + 5^3 + 3^3 = 153
//	1      125  + 27 = 153
//	1==count=1 -- 1^1=1
//	2,3,4,5,6,7,8,9
	public static void main(String[] args) {
		int num= 153;
		int sum=0,last=0,count=0;
		int temp=num;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;//last=5
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul =mul*last;
			}
			sum=sum+mul;//27+125+1
			temp = temp/10;//1
		}
		if(num == sum) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not ");
		}
	}
	

}
