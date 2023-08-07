public class Demo {

	public void m1() {
		System.out.println("for m1 method NO Parameter--");
	}

	public void m2(int i) {
		System.out.println("for m2 method one parameter" + " " + i);

	}

	public void m3(int i, float f, String s) {
		System.out.println(i + " " + f + " " + s);

	}

	public void m4(boolean b, char s, long l) {
		System.out.println(b + " " + s + " " + l);
	}

	public int m5() {
		return 12;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
		d.m2(12);
		d.m3(10, 12.05f, "Abhi");
		d.m4(false, 'a', 124234l);
		int i = d.m5();
		System.out.println(i);
		
		

	}
}
