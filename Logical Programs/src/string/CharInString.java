package string;

public class CharInString {
	
//	 Exponent Class
	
	public static void main(String[] args) {
		
		String s="Exponent Class";
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
