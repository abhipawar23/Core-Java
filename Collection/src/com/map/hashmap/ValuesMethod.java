package com.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValuesMethod {

	public static Map<String, Map<Integer, String>> allParties() {
		Map<Integer, String> BJP = new HashMap<>();
		BJP.put(10, "Abhishek");
		BJP.put(20, "Shiv");

		Map<Integer, String> NCP = new HashMap<>();
		NCP.put(30, "Mahesh");
		NCP.put(50, "Aditya");

		Map<String, Map<Integer, String>> allParties = new HashMap<>();
		allParties.put("BJP", BJP);
		allParties.put("NCP", NCP);
		return allParties;
	}

	public static void main(String[] args) {
		System.out.println("-----Using For Each Loop-----");
		Map<String, Map<Integer, String>> parties = allParties();
		Collection<Map<Integer, String>> value = parties.values();
		for (Map<Integer, String> party : parties.values()) {
			for (String member : party.values()) {
				System.out.println(member);
			}
		}
		System.out.println("\n-----Using Iterator-----");
		Iterator<Map<Integer, String>> itr = value.iterator();
		while (itr.hasNext()) {
			Map<Integer, String> allParty = itr.next();
			Collection<String> party = allParty.values();
			Iterator<String> itr1 = party.iterator();
			while (itr1.hasNext()) {
				String member = itr1.next();
				System.out.println(member);
			}
		}
	}
}
