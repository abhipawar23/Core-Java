package com.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World {

	public Map<String, Map<String, List<String>>> addWorld() {
		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");

		List<String> gujrat = new ArrayList<>();
		gujrat.add("Vapi");
		gujrat.add("Gandhinagar");
		gujrat.add("Surat");

		Map<String, List<String>> india = new HashMap<>();
		india.put("MAHARASHTRA:-", maharashtra);
		india.put("GUJRAT:-", gujrat);

		List<String> california = new ArrayList<>();
		california.add("Los Angeles");
		california.add("San Francisco");
		california.add("Long Beach");

		List<String> georgia = new ArrayList<>();
		georgia.add("Columbus");
		georgia.add("Sandy Springs");
		georgia.add("Roswell");

		Map<String, List<String>> USA = new HashMap<>();
		USA.put("CALIFORNIA:-", california);
		USA.put("GEORGIA:-", georgia);

		Map<String, Map<String, List<String>>> world = new HashMap<>();
		world.put("*INDIA*", india);
		world.put("*USA*", USA);
		return world;
	}

	public static void main(String[] args) {
		World allcountry = new World();
		Map<String, Map<String, List<String>>> world = allcountry.addWorld();
		System.out.println("-----Using Iterator-----");
		Set<String> keys = world.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String countries = itr.next();
			System.out.println(countries);
			Map<String, List<String>> allCountry = world.get(countries);
			Set<String> allstate = allCountry.keySet();
			// System.out.println(allstate);
			Iterator<String> itr2 = allstate.iterator();
			while (itr2.hasNext()) {
				String state = itr2.next();
				System.out.println(state);
				List<String> allCity = allCountry.get(state);
				// System.out.println(allCity);
				Iterator<String> itr3 = allCity.iterator();
				while (itr3.hasNext()) {
					String allcity = itr3.next();
					System.out.println(allcity);
				}
			}
		}
		System.out.println("\n-----Using For Each Loop");
		for (String countries : world.keySet()) {
			System.out.println(countries);
			Map<String, List<String>> country = world.get(countries);
			for (String states : country.keySet()) {
				System.out.println(states);
				List<String> cities = country.get(states);
				for (String city : cities) {
					System.out.println(city);
				}
			}
		}
	}
}
