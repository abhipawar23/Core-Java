package com.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mall {

	public List<List<String>> addSection() {
		List<String> firstFloar = new ArrayList<>();
		firstFloar.add("Gents");
		firstFloar.add("Ladies");

		List<String> secondFloar = new ArrayList<>();
		secondFloar.add("Sports");
		secondFloar.add("GYM");

		List<String> thirdFloar = new ArrayList<>();
		thirdFloar.add("KIDS TOY");
		thirdFloar.add("KIDS DRESS");

		List<List<String>> mall = new ArrayList<>();
		mall.add(firstFloar);
		mall.add(secondFloar);
		mall.add(thirdFloar);
		return mall;

	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		List<List<String>> mallFloar = mall.addSection();
		System.out.println(mallFloar);
		System.out.println("\nUsing For Each Loop");
		for (List<String> mallList : mallFloar) {
			for (String section : mallList) {
				System.out.println(section); 
			}
		}
		System.out.println("\nUsing Iterator");
		Iterator<List<String>> allFloar = mallFloar.iterator();
		while (allFloar.hasNext()) {
			List<String> floar = allFloar.next();
			Iterator<String> section = floar.iterator();
			while (section.hasNext()) {
				String sectionName = section.next();
				System.out.println(sectionName);
			}
		}
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < mallFloar.size(); i++) {
			// System.out.println(mallFloar.get(i));
			List<String> section = mallFloar.get(i);
			for (int j = 0; j < section.size(); j++) {
				System.out.println(section.get(j));
			}
		}
	}
}
