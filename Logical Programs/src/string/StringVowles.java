package string;

public class StringVowles {
	
//	a e i o u
	public static void main(String[] args) {
		
		String s= "Exponent*7";
		s=s.toLowerCase();
		int vCount=0;
		int cCount=0;
		int sCount=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') {
				vCount++;
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {
				cCount++;
			}
			else {
				sCount++;
			}
		}
		
		System.out.println("V "+vCount);
		System.out.println("C "+cCount);
		System.out.println("S "+sCount);
		
	}

}
