package com.set;

import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();// HASHSET IS NOT ALLOWED INSERTION ORDER
		set.add(10); // DUBLICATE VALUE NOT ALLOWED
		set.add(20);
		set.add(10);
		set.add(50);
		set.add(90);
		set.add(80);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains(11));
		set.remove(80);
		System.out.println(set);

		Iterator<Integer> itr = set.iterator();
		System.out.println("\nUsing Iterartor");
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
		}
		System.out.println("\nUsing For Each Loop");
		for (Integer i2 : set)
			System.out.println(i2);
		System.out.println("\nUsing for Loop");
		for (int i = 0; i < set.size(); i++)
			System.out.println(set);

		System.out.println("-----LinkedHashSet-----");
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set2.add(null);
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println(set2.contains(null));
		System.out.println(set.isEmpty());
		set2.remove(null);
		System.out.println(set2);

		Iterator<Integer> itr1 = set2.iterator();
		System.out.println("\nUsing Iterator");
		while (itr1.hasNext()) {
			Integer i = itr1.next();
			System.out.println(i);
		}
		System.out.println("\nUsong For Each Loop");
		for (Integer i1 : set2)
			System.out.println(i1);
		System.out.println("\nUsing For Loop");
		for (int k = 0; k < set2.size(); k++)
			System.out.println(k);

		System.out.println("-----TreeSet-----");
		Set<Integer> set3 = new TreeSet<>();
		set3.add(11);
		set3.add(22);
		set3.add(33);
		// set3.add(null);
		System.out.println(set3);
		Iterator<Integer> i3 = set3.iterator();
		while (i3.hasNext()) {
			Integer i = i3.next();
			System.out.println(i);
		}
		System.out.println("\nUsing For Eaach Loop");
		for (Integer i : set3) {
			System.out.println(i);
		}
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < set3.size(); i++) {
			System.out.println(set3);

		}
	}
}
