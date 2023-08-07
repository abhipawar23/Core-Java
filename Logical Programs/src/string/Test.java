package string;

import java.util.Scanner;

public class Test {

	public static void m1() {

		String s = "Welcome To Java";
		System.out.println(s);

		String find = "Jav";

		int i = s.indexOf(find);
		if (i > 0) {
			// System.out.println(s.substring(i, i + find.length()));
			System.out.println("String Is Present");
		} else {
			System.out.println("String Not Found");
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
	//	m1();
		Scanner sc = new Scanner(System.in);

		String string = "Welcome To Exponent Class";
		System.out.println(string);

		System.out.println("Enter Your String To Find:-");
		String find = sc.next();
		

		boolean flag = string.contains(find);
		

		if (flag) {
			System.out.println("String Is Present :- " + find);
		} else {
			System.out.println("String Is Not Present");
		}
	}
}