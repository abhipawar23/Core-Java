package com.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedListExample {

	public static void main(String[] args) {

		List<Integer> al = new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(50));
		System.out.println(al.get(1));

		Iterator<Integer> str = al.iterator();
		System.out.println("\nUsing While Loop");
		while (str.hasNext()) {
			Integer s = str.next();
			System.out.println(s);
		}
		System.out.println("\nUsing For Each Loop");
		for (Integer i1 : al)
			System.out.println(i1);

		System.out.println("\nUsing for Loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}
}
