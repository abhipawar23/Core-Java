package array;

import java.util.Arrays;

public class ElementSearchBinarayUsingMEthod {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 5, 7, 9};
		
		int value=Arrays.binarySearch(a, 78);
		
//		contains   index=2
//		not contains -ve 
		System.out.println(value);
		if(value > 0)
			System.out.println("contains");
		else
			System.out.println("Not contains");
	}

}
