package string;

public class FindWordInString {
	
//	xyjdcluyfvlivbrkcjhabbiycgavkugtldlutdflhjbkhf7ti >> rabbit  ---not contains
//                r    abbi   a    t
	
	public static void main(String[] args) {
		String s="xyjdcluyfvlivbrkcjhabbiycgvkugtldlutdflhjbkhf7ti";
		
		String search="rabbit";
		
		int sl=s.length();
		
		s=s.replaceAll("[^rabbit]", "");
		System.out.println(s);
		boolean flag= false;
		
//		for(int i=0;i<s.length()-5;i++) {
//			if(s.charAt(i)=='r'&& s.charAt(i+1)=='a')
//				flag= true;
//		}
		
		
		if(s.contains(search)) {
			System.out.println("contains");
		}else {
			System.out.println("Not");
		}
		
	}
}
