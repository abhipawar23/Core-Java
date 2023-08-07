package com.Controller;

import com.model.AllEmployee;
import com.service.Department;



public class Company {

	public static void main(String[] args) {
		
		 Department dep = new  Department ();
		AllEmployee E = dep.AllEmployeeDetails();
		
		System.out.println("---ALL EMPLOYEES DETAILS---");
		
		System.out.println(E.e1.id + " " + E.e1.Ename + " " + E.e1.Eaddress );
		System.out.println(E.e2.id + " " + E.e2.Ename + " " + E.e2.Eaddress);
		System.out.println(E.e3.id + " " + E.e3.Ename + " " + E.e3.Eaddress);
	

	}

}
