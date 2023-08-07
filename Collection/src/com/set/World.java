package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class World {

	public Set<Set<Set<String>>> addCountry() {

		Set<String> maharashtra = new HashSet();
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");
		maharashtra.add("Pune");

		Set<String> gujrat = new HashSet();
		gujrat.add("Surat");
		gujrat.add("GandhiNagar");
		gujrat.add("Vapi");
		gujrat.add("GandhiNagar");

		Set<Set<String>> india = new HashSet<>();
		india.add(maharashtra);
		india.add(gujrat);

		Set<String> California = new HashSet<>();
		California.add("San Francisco");
		California.add("Los Angeles");
		California.add("Long Beach");
		California.add("San Francisco");

		Set<String> Georgia = new HashSet<>();
		Georgia.add("Columbus.");
		Georgia.add("Sandy Springs");
		Georgia.add("Roswell");
		Georgia.add("Roswell");

		Set<Set<String>> USA = new HashSet<>();
		USA.add(California);
		USA.add(Georgia);

		Set<Set<Set<String>>> world = new HashSet<>();
		world.add(USA);
		world.add(india);
		return world;
	}

	public static void main(String[] args) {
		World world = new World();
		Set<Set<Set<String>>> world1 = world.addCountry();
		System.out.println(world1);

		System.out.println("\nUsing For Each Loop");
		for (Set<Set<String>> worldlist : world1) {
			for (Set<String> countries : worldlist) {
				for (String cities : countries) {
					System.out.println(cities);
				}
			}
		}
		System.out.println("\nUsnig Iterator");
		Iterator<Set<Set<String>>> countries = world1.iterator();
		while (countries.hasNext()) {
			Set<Set<String>> country = countries.next();
			Iterator<Set<String>> cities = country.iterator();
			while (cities.hasNext()) {
				Set<String> city = (Set<String>) cities.next();
				Iterator<String> cityname = city.iterator();
				while (cityname.hasNext()) {
					String cities1 = cityname.next();
					System.out.println(cities1);
				}
			}
		}
//		System.out.println("\nUsing For Loop");
//		for (int i = 0; i < world1.size(); i++) {
//			Set<Set<String>> city = world1.get(i);
//			for (int j = 0; j < city.size(); j++) {
//				Set<String> cities = city.get(j);
//				for (int k = 0; k < cities.size(); k++) {
//					System.out.println(cities.get(k));
//				}
//			}
//		}
		System.out.println("\n-------------");
		for (int i = 0; i < world1.size(); i++) {
		//	System.out.println(world1.stream().toList().get(i));
//			for (int j = 0; j <i.size(); j++) {
//				System.out.println(world1.stream().toList().get(j));
			}

		}
	}
//}