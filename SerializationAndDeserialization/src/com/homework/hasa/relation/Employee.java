package com.homework.hasa.relation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private String ename;
	private int eid;
	private Department department;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static void main(String[] args) throws IOException {
		Department dept = new Department();
		dept.setDeptname("Computer Science");

		Employee emp = new Employee();
		emp.setEid(10);
		emp.setEname("ABHI");
		emp.setDepartment(dept);
//		System.out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getDepartment().getDeptname());
		FileOutputStream file = new FileOutputStream("HasaRelation.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(emp);
		out.close();
		System.out.println("done it  !!!");

	}

}
