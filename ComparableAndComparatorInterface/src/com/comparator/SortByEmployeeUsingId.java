package com.comparator;

import java.util.Comparator;

public class SortByEmployeeUsingId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.eid > o2.eid) {
			return 1;
		} else if (o1.eid == o2.eid) {
			return 0;
		} else {
			return -1;
		}
	}
}