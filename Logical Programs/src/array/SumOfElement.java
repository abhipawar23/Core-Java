package array;

public class SumOfElement {
	
//	1+2+5
	
	
	public static void main(String[] args) {
		
		String s=null;
		String s1= "" ;
		
		Integer ik=null;
		Integer ik1=0;
		
		int a[]= {1,2,5,7,9,2}; //length = 6 index = 0-5
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum = sum +a[i];
		}
		
		System.out.println(sum);
		sum=0;
		
		for(int value : a) {
			sum += value;
		}
		
		System.out.println(sum);
	}

}
