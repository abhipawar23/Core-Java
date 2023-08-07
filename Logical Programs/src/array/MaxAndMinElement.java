package array;

public class MaxAndMinElement {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 5, 7, 9, 2 };
		
		int max = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(max < a[i]) {//1<2  >> true  2<5 >true   9<2 >false 
				max = a[i]; //2
			}
		}
		
		System.out.println(max);
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(min > a[i]) {//1<2  >> true  2<5 >true   9<2 >false 
				min = a[i]; //2
			}
		}
		
		System.out.println(min);
	}

}
