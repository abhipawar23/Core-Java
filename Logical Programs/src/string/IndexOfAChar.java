package string;

public class IndexOfAChar {
	
	public static void main(String[] args) {
		String s="exponent";
		
		for(int i=0;i<s.length();i++) {
//			System.out.println("Char");
			if(s.charAt(i)=='e') {
				System.out.println(i);
			}
		}
	}

}
