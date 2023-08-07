package array;

public class MostFrequentNumber {
	public static void main(String[] args) {
		int a[]= {100,500,300,400,200,100,300,300,500};
		
		int element=0; //100 //300
		int count=0;   //2   //3  
	
		for(int i=0;i<a.length;i++) {
			int tempElement = a[i]; //300
			int tempCount=0;        //0
			for(int j=0;j<a.length;j++) {
				if(a[j]== tempElement) {
					tempCount++;
				}
			}
			if(tempCount > count) { //3>2 
				element=tempElement; 
				count=tempCount;
			}
		}
		System.out.println("Most frequent number is "+element);
		System.out.println("Count : "+count);
	}

}
