package array;

import java.util.Arrays;

public class BubbleSort {
//	4 , 2 ,1 ,5, 3  length -1 =
//	2 4 1 5 3       1st > 2nd
//	2 1 4 5 3
//	1 2 4 5 3
//	1 2 4 3 5
//	1 2 3 4 5
	
//	12345
	public static void main(String[] args) {
		int a[]= {4,2,1,5,3};  
		int n= a.length-1;
		for(int i=0;i<n;i++) { //camparsion
			for(int j=0;j<n;j++) {//swapping
				if(a[j]>a[j+1]) {   //4>2 
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
