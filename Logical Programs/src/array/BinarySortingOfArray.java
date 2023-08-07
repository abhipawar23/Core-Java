package array;

public class BinarySortingOfArray {
//	      3-1   3  3+1
//	1  2  3  4  5  6  7     //sort asce
//	la     m=4        ra
//	l=0         l=m+1      h=a.length-1
//	
//	l=0   h=m-1 l=m+1   h=a.length-1   
	
//	a[m]==seach >>> flag =true
//	a[m]>search >>> h=m-1
//	a[m] <search >> l=m+1
	
//	1 2 3
//	l=0  h=m-1
//	m=2  
	
//	2 3
//	3
	
//	5 6 7
//	l=m+1  h=a.length-1
	
//	l=0    h=m-1
	
//	search = 3
	
	
//	SecondLargestNumber
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		boolean flag=false;
		int search=45;
		int l=0;
		int h=a.length-1; // 8 /2 = 4
		
		while(l<=h) {
			
			int m=(l+h)/2;
			if(a[m]==search) {
				flag= true;
				break;
			}
			if(a[m]>search) {
				h = m-1;
			}
			if(a[m]<search) {
				l= m+1;
			}
			
		}
		
		if(flag) {
			System.out.println("contains");
		}
		else {
			System.out.println("doesn't");
		}
		
		
	}

}
