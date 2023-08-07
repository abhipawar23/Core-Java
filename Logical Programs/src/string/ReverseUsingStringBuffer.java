package string;

import java.util.Scanner;

public class ReverseUsingStringBuffer {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		String numString=String.valueOf(num);
		
		StringBuffer sb= new StringBuffer(numString);
		StringBuffer sbRev=sb.reverse();
		
		String revString=sbRev.toString();
		
		int rev=Integer.parseInt(revString);
		
		System.out.println("Reverse "+rev);
	}

}
