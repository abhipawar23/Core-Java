package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Mall {

	public Set<Set<String>> addSection() {
		Set<String> firstFloar = new HashSet<>();
		firstFloar.add("Ladies");
		firstFloar.add("Gents");
		firstFloar.add("Ladies");

		Set<String> secondFloar = new HashSet<>();
		secondFloar.add("Sports");
		secondFloar.add("GYM");

		Set<String> thirdFloar = new HashSet<>();
		thirdFloar.add("KIDS TOY");
		thirdFloar.add("KIDS DRESS");
		thirdFloar.add("KIDS TOY");

		Set<Set<String>> mall = new HashSet<>();
		mall.add(firstFloar);
		mall.add(secondFloar);
		mall.add(thirdFloar);
		return mall;

	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		Set<Set<String>> mallFloar = mall.addSection();
		System.out.println(mallFloar);
		System.out.println("\nUsing For Each Loop");
		for (Set<String> mallList : mallFloar) {
			for (String section : mallList) {
				System.out.println(section);
			}
		}
		System.out.println("\nUsing Iterator");
		Iterator<Set<String>> allFloar = mallFloar.iterator();
		while (allFloar.hasNext()) {
			Set<String> floar = allFloar.next();
			Iterator<String> section = floar.iterator();
			while (section.hasNext()) {
				String sectionName = section.next();
				System.out.println(sectionName);
			}
		}
//		System.out.println("\nUsing For Loop");
//		for (int i = 0; i < mallFloar.size(); i++) {
//			// System.out.println(mallFloar.get(i));
//			Set<String> section = mallFloar.get(i);
//			for (int j = 0; j < section.size(); j++) {
//				System.out.println(section.get(j));
//			}
//		}
	}
}
