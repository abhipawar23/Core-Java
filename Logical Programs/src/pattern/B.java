package pattern;

public class B {

//	1
//	1 2
//	1 2 3
//	1 2 3 4
	
//	(1,1)
//	(2,1) (2,2)       int i=1;i<=5;i++ >>> int j=1;j<=i;j++
//	(3,3)
	
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
