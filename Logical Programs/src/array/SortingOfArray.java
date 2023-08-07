package array;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfArray {
	
	public static void main(String[] args) {
		Integer a[]= {4,2,1,5,3};
		
//		Arrays.parallelSort(a);
//		Arrays.sort(a);
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}

}
