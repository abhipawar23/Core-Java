public class Main extends abc {

	public Main(String s) {
		super(s);
	}

	int j = 123;

	public void m2() {

		System.out.println("m2 method of abc class");
		super.m1();
		System.out.println(super.i);// 10
		System.out.println(super.name);// Abhi
		System.out.println(this.j); // 123
	}

	public void m3() {
		System.out.println("\nm3 method of main class");
		System.out.println(this.j);// 123
		this.m2();// total m2 method call

	}

	public int m4() {
		System.out.println("\nm4 mothod of main class");
		super.m1();
		System.out.println(this.j);
		return i;
	}

	public Main m5() {
		System.out.println("\nm5 method of main class");
		Main d = new Main("hello");
		System.out.println(this.j);
		return d;
	}
	
	
		
	
	public static void main(String[] args) {
		Main main = new Main("asd");
		main.m2();
		main.m3();
		int abc = main.m4();
		System.out.println("m4 method of b class int type value:-" + abc);
		main.m5();

	}
}
