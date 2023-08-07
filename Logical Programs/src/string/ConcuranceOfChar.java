package string;

public class ConcuranceOfChar {
	
//	hello element
	
	public static void main(String[] args) {
		
		String s="hello element";
		int t=s.length();
		System.out.println(t);
		int t1=s.replaceAll("e", "").length(); //hllo lmnt
		System.out.println(t-t1);
	}
}
