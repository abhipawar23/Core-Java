package pattern;

public class A {
	
//  *
//	* *
//	* * *
//	* * * *
	
//	(1,1)          int i=1 ;i<=4;i++ >>> int j=1;j<=i;j++
//	(2,1) (2,2)
//	(3,1) (3,2) (3,3)
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
