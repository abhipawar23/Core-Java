package array;

public class DuplicateElement {
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 9 };
//		           a=1 >> i = 0  j = 1
//		               a=2 i= 1 j=i+1
		
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
		}
		
		if(count != 0)
			System.out.println("It contains duplicate");
		else
			System.out.println("It doesn't contains duplicate");
		
	}

}
