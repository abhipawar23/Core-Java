package practice;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Persist {

	
 public static void main(String[] args) throws IOException {
	 Employee e= new Employee( 122,"shweta", 50000);  
	 Employee e1=new Employee(123,"Nikita",30000);
	 
	 FileOutputStream fio=new FileOutputStream("xyz.txt");
	 ObjectOutputStream out =new ObjectOutputStream(fio);
	 out.writeObject(e);
	 out.writeObject(e1);
	 out.close();
	 System.out.println("success..");
	

}
}
