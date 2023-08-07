package pattern;

public class G {
//	1 
//	0 1
//	1 0 1
//	0 1 0 1
	
//	(1,1)
//	(2,1) (2,2)
//	(3,1) (3,2) (3,3)
	
//	2
//	3 4 
//	4 5 6
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum % 2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			
			System.out.println();
		}
	}

}
