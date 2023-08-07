package array;

public class EqualArrayCheck {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 7, 9, 2 };
		int a2[] = { 1, 2, 5, 7, 9, 2 };

		boolean flag = true;

		if (a1.length == a2.length) {

			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					flag = false;
				}
			}
		} else {
			System.out.println("not equal");
		}
		
		
		if(flag)
			System.out.println("Equal");
		else
			System.out.println("not equal");

	}
}
