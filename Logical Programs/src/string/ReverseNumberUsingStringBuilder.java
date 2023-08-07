package string;

import java.util.Scanner;

public class ReverseNumberUsingStringBuilder {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		
		StringBuilder sb1=sb.reverse();
		
		System.out.println(sb1);
		
	}

}
