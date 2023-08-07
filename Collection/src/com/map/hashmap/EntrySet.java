package com.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Abhishek");
		map.put(20, "Shiv");
		map.put(30, "Mahesh");
		map.put(40, "Adesh");
		map.put(50, "Aditya");

		System.out.println(map);
		System.out.println("-----Using Iterator-----");
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("\n-----Using For Each Loop-----");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
