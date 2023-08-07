package pattern;

public class E {
	
//	A
//	B B
//	C C C
	
	public static void main(String[] args) {
		int al=65;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(al+i));
			}
			System.out.println();
		}
		
	}

}
