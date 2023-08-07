package string;

public class RemoveSpecialChar {
	
//	"@$^&& gyic 1984 ASDF "
	
	public static void main(String[] args) {
		
		String s="@$^&& gyic 1984 ASDF";
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
		
	}

}
