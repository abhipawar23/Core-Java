package com.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add("ABC");
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(null);
		list.add(null);

		System.out.println(list);
		System.out.println(list.size());// find list size
		System.out.println(list.get(0)); // find element on index
		System.out.println(list.isEmpty());// list is empty or not
		System.out.println(list.contains(8)); // element present yes or no
		System.out.println(list.contains("ABC"));
		list.remove(2);// for remove index element
		System.out.println(list);
		System.out.println(list.size());

	}
}
