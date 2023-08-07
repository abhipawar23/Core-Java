package com.map.hashmap;

import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "ABHI");
		map.put(102, "Shiv");
		map.put(103, "Adi");
		map.put(104, "Adi");
		map.put(null, null);
		map.put(100, null);

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsKey(101));
		System.out.println(map.containsValue("ABC"));
		System.out.println(map.isEmpty());
		System.out.println(map.get(106)); // null value

		System.out.println("Using Iterator interface");

		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + " " + map.get(key));
		}
		System.out.println("Uding For Each Loop");
		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
