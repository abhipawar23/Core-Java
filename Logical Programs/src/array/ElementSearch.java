package array;

// Linear Search

public class ElementSearch {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 5, 7, 9};
		
		int search =12;
		
		int count = 0;
		
		for(int value : a) {
			if(search == value)
				count++;
		}
		
		if(count != 0)
		{
			System.out.println("contains");
		}
		else {
			System.out.println("not contain");
		}
		
		
	}

}
