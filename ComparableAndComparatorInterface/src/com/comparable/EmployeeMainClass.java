package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setName("ABHI");
		emp1.setAddress("NAGAR");

		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setName("Avej");
		emp2.setAddress("Pune");

		Employee emp3 = new Employee();
		emp3.setId(-100);
		emp3.setName("Rushi");
		emp3.setAddress("Nagar");

		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		System.out.println("---Before Sorting---");
		for (Employee employe : listOfEmployee) {
			//System.out.println(employe.getId() + " " + employe.getName() + " " + employe.getAddress());
			 System.out.println(employe);
		}

		System.out.println("\n---After Sorting---");
		Collections.sort(listOfEmployee);
		for (Employee emp : listOfEmployee) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getAddress());
		}
	}
}
