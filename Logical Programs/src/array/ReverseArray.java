package array;

import java.util.Arrays;

public class ReverseArray {

//	a=1 2 3 4 5
//	  5 2 3 4 1  i=0
//	  5 4 3 2 1  i=1
//	  5 4 3 2 1  i=3
//	  5 2 3 4 1  i= 4
//	  1 2 3 4 5   i=5
	
//	i=a.length-1 ; i>=0;i--
//	a=5 4 3 2 1
//	int secondArray
//	
	
	public static void main(String[] args) {
		
		int a[]= {4,8,7,3,9};
		int n=a.length-1;
		for(int i=0;i<n/2;i++) {
			int temp=a[n-i];
			a[n-i]=a[i];
			a[i]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}
	
}
