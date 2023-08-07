package com.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {

	public List<List<List<String>>> addCountry() {

		List<String> maharashtra = new ArrayList();
		maharashtra.add("Mumbai");
		maharashtra.add("Nagpur");
		maharashtra.add("Pune");

		List<String> gujrat = new ArrayList();
		gujrat.add("Surat");
		gujrat.add("GandhiNagar");
		gujrat.add("Vapi");

		List<List<String>> india = new ArrayList<>();
		india.add(maharashtra);
		india.add(gujrat);

		List<String> California = new ArrayList<>();
		California.add("San Francisco");
		California.add("Los Angeles");
		California.add("Long Beach");

		List<String> Georgia = new ArrayList<>();
		Georgia.add("Columbus");
		Georgia.add("Sandy Springs");
		Georgia.add("Roswell");

		List<List<String>> USA = new ArrayList<>();
		USA.add(California);
		USA.add(Georgia);

		List<List<List<String>>> world = new ArrayList<>();
		world.add(USA);
		world.add(india);
		return world;
	}

	public static void main(String[] args) {
		World world = new World();
		List<List<List<String>>> world1 = world.addCountry();
		System.out.println(world1);

		System.out.println("\nUsing For Each Loop");
		for (List<List<String>> worldlist : world1) {
			for (List<String> countries : worldlist) {
				for (String cities : countries) {
					System.out.println(cities);
				}
			}
		}
		System.out.println("\nUsnig Iterator");
		Iterator<List<List<String>>> countries = world1.iterator();
		while (countries.hasNext()) {
			List<List<String>> country = countries.next();
			Iterator<List<String>> cities = country.iterator();
			while (cities.hasNext()) {
				List<String> city = cities.next();
				Iterator<String> cityname = city.iterator();
				while (cityname.hasNext()) {
					String cities1 = cityname.next();
					System.out.println(cities1);
				}
			}
		}
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < world1.size(); i++) {
			List<List<String>> city = world1.get(i);
			for (int j = 0; j < city.size(); j++) {
				List<String> cities = city.get(j);
				for (int k = 0; k < cities.size(); k++) {
					System.out.println(cities.get(k));
				}
			}
		}
	}
}