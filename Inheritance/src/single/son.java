package single;

public class son extends father {
	int y = 20;

	public void m2() {
		System.out.println("m1 method of son class");
	}
	public static void main(String[]args) {
		father f = new father(); //parent class
		System.out.println(f.x);
		f.m1();
		
		son s = new son();  //child class
		System.out.println(s.x);
		System.out.println(s.y);
		s.m1();
		s.m2();
		
	}
}