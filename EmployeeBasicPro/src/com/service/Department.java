package com.service;

import com.model.AllEmployee;

public class Department {

	public AllEmployee AllEmployeeDetails() {

		AllEmployee all = new AllEmployee();
		all.e1.id = 1;
		all.e1.Ename = "Abhi";
		all.e1.Eaddress = "Nagar";

		all.e2.id = 2;
		all.e2.Ename = "Radhe";
		all.e2.Eaddress = "Pune";

		all.e3.id = 3;
		all.e3.Ename = "RAJ";
		all.e3.Eaddress = "Mumbai";

		return all;

	}

}