package array;

public class FindACharInArray {
	
//	search= 1
//	11 , 12, 31 , 45    
//  2   1   1   0 ==4
	
	public static void main(String[] args) {
		int a[]= {11,12,31,45};
		char search='1';
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			String num=String.valueOf(a[i]);
			for(int j=0;j<num.length();j++) {
				if(search == num.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
