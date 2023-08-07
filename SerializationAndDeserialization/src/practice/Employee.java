package practice;

import java.io.Serializable;

public class Employee implements Serializable {
	int eid;
	String eName;
	double salary;
	
	public Employee(int eid, String eName, double salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}
	
	

}

