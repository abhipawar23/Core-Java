package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Abhishek", 10000);
		Employee e2 = new Employee(1, "Abhi", 15000);
		Employee e3 = new Employee(100, "Sagar", 240000);
		Employee e4 = new Employee(78, "Abc", 67000);
		Employee e5 = new Employee(13, "Pqr", 89000);

		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		listOfEmployee.add(e5);

		System.out.println("---Before Sorting---");
		for (Employee e : listOfEmployee) {
			System.out.println(e);
		}
		Collections.sort(listOfEmployee, new SortByEmployeeUsingId());
		System.out.println("\n--Employee Sorting Using ID---");
		for (Employee employee : listOfEmployee) {
			System.out.println(employee);
		}
		Collections.sort(listOfEmployee, new SortByEmployeeUsingNames());
		System.out.println("\nEmployee Sorting Using Name");
		for (Employee employee : listOfEmployee) {
			System.out.println(employee);
		}
		Collections.sort(listOfEmployee, new SortByEmployeeUsingIdName());
		System.out.println("\nSorting Using Name && Id");
		for (Employee employee : listOfEmployee) {
			System.out.println(employee);
		}

	}
}
