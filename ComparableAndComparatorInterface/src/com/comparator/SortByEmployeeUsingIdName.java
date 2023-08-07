package com.comparator;

import java.util.Comparator;

public class SortByEmployeeUsingIdName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.eid > o2.eid) {
			return 1;
		} else if (o1.eid == o2.eid) {
			return o1.ename.compareTo(o2.ename);
		} else {
			return -1;

		}

	}
}
