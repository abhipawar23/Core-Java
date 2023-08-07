package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DPersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("xyz.txt"));
		Employee e = (Employee) in.readObject();// object
		Employee emp = (Employee) in.readObject();
		System.out.println(e.eid + " " + e.eName + " " + e.salary);
		System.out.println(emp.eid + " " + emp.eName + " " + emp.salary);
	}

}

