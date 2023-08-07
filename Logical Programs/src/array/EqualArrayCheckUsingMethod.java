package array;

import java.util.Arrays;

public class EqualArrayCheckUsingMethod {
	
	public static void main(String[] args) {
		int a1[] = { 1, 2, 5, 7, 9, 2 };
		int a2[] = { 1, 2, 5, 7, 9, 2 };
		
		boolean flag=Arrays.equals(a1, a2);
		
		if(flag)
			System.out.println("Equal");
		else
			System.out.println("not equal");
	}

}
