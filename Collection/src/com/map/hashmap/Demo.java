package com.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		System.out.println("------HashMap------"); // insertion order not ,maintain
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 101);
		map.put("xyz", null);
		map.put("Abcs", 100);
		map.put(null, null);
		System.out.println(map);
		Set<String> keys = map.keySet();
		System.out.println("\nUsing Iterator");
		Iterator<String> key = keys.iterator();
		while (key.hasNext()) {
			String key1 = key.next();
			System.out.println(key1 + " " + map.get(key1));
		}
		System.out.println("\nUsing For Each Loop");
		for (String pqr : map.keySet()) {
			System.out.println(pqr + " " + map.get(pqr));
		}

		System.out.println("\n------LinkedHashMap-------");// insertion order maintain

		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(10, "ABHISHEK");
		map1.put(20, "Sushant");
		map1.put(null, null);
		map1.put(null, "ABC");
		map1.put(10, "ABHI");
		map1.put(11, "ABHISHEK");

		System.out.println("Using Itearator");
		Set<Integer> key1 = map1.keySet();
		Iterator<Integer> id = key1.iterator();
		while (id.hasNext()) {
			Integer id1 = id.next();
			System.out.println(id1 + " " + map1.get(id1));
		}
		System.out.println("\nUsing For Each Loop");
		for (Integer imp : map1.keySet()) {
			System.out.println(imp + " " + map1.get(imp));
		}
		System.out.println("\n------TreeMAp------");// asending order maintain
		Map<Integer, String> map2 = new TreeMap<>();
		map2.put(2, null);
		map2.put(4, null);
		map2.put(3, "AAA");
		map2.put(1, "BBB");
		map2.put(66, "ZZZ");
		Set<Integer> use = map2.keySet();
		System.out.println("Using Iterator");
		Iterator<Integer> use1 = use.iterator();
		while (use1.hasNext()) {
			Integer m1 = use1.next();
			System.out.println(m1 + " " + map2.get(m1));
		}
		System.out.println("\nUsing For Each Loop");
		for (Integer itr : map2.keySet()) {
			System.out.println(itr + " " + map2.get(itr));
		}
	}
}