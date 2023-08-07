package pattern;

public class D {
	
//	A
//	A B
//	A B C
//	A B C D
	
	public static void main(String[] args) {
		
		int alphabet= 65;
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=i;j++) {
				char c=(char)(alphabet + j); 
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
