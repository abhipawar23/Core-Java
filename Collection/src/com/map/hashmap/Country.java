package com.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country {

	public Map<String, List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("MUMBAI");
		maharashtra.add("PUNE");
		maharashtra.add("SOLAPUR");

		List<String> gujrat = new ArrayList<>();
		gujrat.add("VAPI");
		gujrat.add("GANDHINAGAR");
		gujrat.add("SURAT");

		Map<String, List<String>> india = new HashMap<>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJRAt", gujrat);
		return india;
	}

	public static void main(String[] args) {
		Country country = new Country();
		Map<String, List<String>> india = country.addCountry();
		System.out.println("----Usong Iterator----");
		Set<String> keys = india.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String statename = itr.next();
			System.out.println(statename);
			List<String> stateList = india.get(statename);
			Iterator<String> itr2 = stateList.iterator();
			while (itr2.hasNext()) {
				String city = itr2.next();
				System.out.println(city);
			}
			
		}
		
		
		System.out.println("\n----Using For Loop----");
		for (String key : india.keySet()) {
			System.out.println(key);
			List<String> cities = india.get(key);
			for (String city : cities) {
				System.out.println(city);
			}

		}
	}
}