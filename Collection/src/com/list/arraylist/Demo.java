package com.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("ABHISHEK");
		al.add("Om");
		al.add("Hanuman");
		al.add("Mahesh");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.size());
		System.out.println(al.contains("Om"));
		System.out.println(al.isEmpty());

		System.out.println("\nUsing iterator interface:");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("\nUsing For Each Loop");
		for (String str : al) {
			System.out.println(str);
		}
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
