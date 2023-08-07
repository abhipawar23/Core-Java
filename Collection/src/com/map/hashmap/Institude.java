package com.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Institude {

	public static Map<String, Map<String, Map<Integer, String>>> addInstitude() {

		Map<Integer, String> AjaySir = new HashMap<>();
		AjaySir.put(101, "Abhishek");
		AjaySir.put(102, "Mahesh");

		Map<Integer, String> NileshSir = new HashMap<>();
		NileshSir.put(10, "Sushant");
		NileshSir.put(20, "Nishant");

		Map<String, Map<Integer, String>> Exponent1 = new HashMap<>();
		Exponent1.put("NILESH SIR:-", NileshSir);
		Exponent1.put("AJAY SIR:-", AjaySir);

		Map<Integer, String> PrathmeshSir = new HashMap<>();
		PrathmeshSir.put(10, "Rushi");
		PrathmeshSir.put(12, "Shiv");

		Map<Integer, String> AjasSir = new HashMap<>();
		AjasSir.put(1, "Vijay");
		AjasSir.put(2, "Adi");

		Map<String, Map<Integer, String>> Exponent2 = new HashMap<>();
		Exponent2.put("PRATHMESH SIR:-", PrathmeshSir);
		Exponent2.put("AJAS SIR:-", AjasSir);

		Map<String, Map<String, Map<Integer, String>>> allInstitude = new HashMap<>();
		allInstitude.put("*EXPONENT1*", Exponent1);
		allInstitude.put("*EXPONENT2*", Exponent2);
		return allInstitude;
	}

	public static void main(String[] args) {
		Map<String, Map<String, Map<Integer, String>>> allInstitude = addInstitude();
		System.out.println("-----Using For Each Loop-----");
		for (String key1 : allInstitude.keySet()) {
			System.out.println(key1);
			Map<String, Map<Integer, String>> institude = allInstitude.get(key1);
			for (String key2 : institude.keySet()) {
				System.out.println(key2);
				Map<Integer, String> teachers = institude.get(key2);
				for (Integer key3 : teachers.keySet()) {
					String student = teachers.get(key3);
					System.out.println(student);
				}
			}
		}
		System.out.println("\n-----Using Iterator-----");
		Set<String> key1 = allInstitude.keySet();
		Iterator<String> itr1 = key1.iterator();
		while (itr1.hasNext()) {
			String institudes = itr1.next();
			System.out.println(institudes);
			Map<String, Map<Integer, String>> allTeachers = allInstitude.get(institudes);
			// System.out.println(allTeachers);
			Set<String> key2 = allTeachers.keySet();
			// System.out.println(teachers);
			Iterator<String> itr2 = key2.iterator();
			while (itr2.hasNext()) {
				String teachers = itr2.next();
				System.out.println(teachers);
				Map<Integer, String> teacher = allTeachers.get(teachers);
				Set<Integer> key3 = teacher.keySet();
				Iterator<Integer> itr3 = key3.iterator();
				while (itr3.hasNext()) {
					Integer allStudent = itr3.next();
					String student = teacher.get(allStudent);
					System.out.println(student);
				}
			}
		}
	}
}
