package string;

public class StringReveerseWords {
	
//	hello world ==             string
//	{hello} {world}             >> word
//	{olleh} {dlrow}           >> reverseword
//	olleh dlrow               >> reverseString
	
	
//	hello
//	olleh
	
	
	public static void main(String[] args) {
		
		String s="hello world";
		
		String[] words=s.split("\\s");
		
		String reverseString="";
//		for(String word:words) {
//			String reverseWord="";
//			for(int i=word.length()-1;i>=0;i--) {
//				reverseWord=reverseWord+word.charAt(i);
//			}
//			reverseString=reverseString+reverseWord+" ";
//		}
		
//		System.out.println(reverseString);
		
		for(String word: words) {
			StringBuilder sb=  new StringBuilder(word);
			sb.reverse();
			reverseString= reverseString+sb.toString()+" ";
		}
		
		System.out.println(reverseString);
	}

}
