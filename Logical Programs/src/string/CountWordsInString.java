package string;

public class CountWordsInString {
	
//	hello world
//	" "  && "c"
	
	public static void main(String[] args) {
		
		String s="hello world  of java";
		
//		String []ars=s.split("\\s");
//		
//		System.out.println(ars.length);
		
		int count=1;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
