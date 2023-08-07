package multilevel;

public class z extends y {
	int z = 1000;

	public void m4() {
		System.out.println("m4 method of z class");

	}

	public static void main(String[] args) {
		x x1 = new x(); // parent x-class object
		x1.x=10;
		System.out.println(x1.x);
		x1.m1();

		y y1 = new y(); // x+y
		System.out.println("\n" + y1.x);
		y1.m1();
		System.out.println(y1.y);
		y1.m2();
		y1.m3();

		z z1 = new z();// x+y+z
		System.out.println("\n"+z1.x);
		z1.m1();
		System.out.println(z1.y);
		z1.m2();
		z1.m3();
		System.out.println(z1.z);
		z1.m4();
		
		

	}

}
