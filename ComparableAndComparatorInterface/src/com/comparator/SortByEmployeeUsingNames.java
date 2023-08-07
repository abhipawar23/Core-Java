package com.comparator;

import java.util.Comparator;

public class SortByEmployeeUsingNames implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.ename.compareTo(o2.ename);
	}

}
