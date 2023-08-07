package array;

public class EveneAndOdd {
	
//	num % 2 == 0 >>even 
//	num % 2 != 0 >>odd
	
	public static void main(String[] args) {
		
		int a[]= {1,2,5,7,8,2};
		
		System.out.print("Even Number : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(" "+a[i]);
			}
		}
		System.out.println();
		System.out.print("Odd number : ");
		
		for(int value : a) {
			if(value % 2 != 0) {
				System.out.print(" "+value);
			}
		}
	}

}
