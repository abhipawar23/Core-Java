
public class Datatyperun {
	
	//integer
	// byte=1byte short=2byte int=4byte long=8byte
	byte b = 1;
	char w = 'W';
	byte b1;//0
	short s = 10;
	short s1;//0 
	int id = 100;
	int id1;//0
	long l = 100076239369388292l;
	long l1;//0l
	
	String Name = "Pawar";
	String z = "Abhishek";
	
	//floating
	//float=4byte double=8byte
	float f = 12.4f;
	float f1;//0.0f
	double d = 12364.1325819694969;
	double d1;//0.0d
	
	//character=2byte
	char c ='A';
	char c1;//" "
	
	//boolean=1bit
	boolean flag = true;
	boolean flag1;//false
	
	//non primitive String
	String name = "Abhshek";
	String name1;//null
	

public void m1(){
	
	//integer
		// byte=1byte short=2byte int=4byte long=8byte
		byte b = 1;
		//byte b1;//0
		short s = 10;
		//short s1;//0 
		int id = 100;
		//int id1;//0
		long l = 100076239369388292l;
		//long l1;//0l
		
		//floating
		//float=4byte double=8byte
		float f = 12.4f;
		//float f1;//0.0f
		double d = 12364.1325819694969;
		//double d1;//0.0d
		
		//character=2byte
		char c ='A';
		//char c1;//" "
		
		//boolean=1bit
		boolean flag = true;
		//boolean flag1;//false
		
		//non primitive String
		String name = "Abhshek";
		//String name1;//null
		
		System.out.println(b);
		System.out.println(w);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(id);
		System.out.println(id1);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(flag);
		System.out.println(flag1);
		System.out.println(name);
		System.out.println(name1);
		
		
		}
	


	public static void main(String[] args) {
		Datatyperun v = new Datatyperun();
		System.out.println("show values of data in global variables");
		System.out.println(v.b);
		System.out.println(v.b1);
		System.out.println(v.s);
		System.out.println(v.s1);
		System.out.println(v.id);
		System.out.println(v.id1);
		System.out.println(v.l);
		System.out.println(v.l1);
		System.out.println(v.f);
		System.out.println(v.f1);
		System.out.println(v.d);
		System.out.println(v.d1);
		System.out.println(v.c);
		System.out.println(v.c1);
		System.out.println(v.flag);
		System.out.println(v.flag1);
		System.out.println(v.name);
		System.out.println(v.name1);
		
		System.out.println("----show values of data in local variables");
		v.m1();
        System.out.println(v.Name + "       " + v.z);
		

	}

}
