package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Country {

	public Set<Set<String>> addCountry() {
		Set<String> maharashtra = new HashSet<>();
		maharashtra.add("Mumbai");
		maharashtra.add("Nagpur");
		maharashtra.add("Pune");

		Set<String> gujrat = new HashSet<>();
		gujrat.add("Surat");
		gujrat.add("GandhiNagar");
		gujrat.add("Vapi");
		gujrat.add("GandhiNagar");

		Set<Set<String>> india = new HashSet<>();
		india.add(maharashtra);
		india.add(gujrat);

		return india;
	}

	public static void main(String[] args) {
		Country country = new Country();
		Set<Set<String>> india = country.addCountry();
		System.out.println(india);
		System.out.println("\nUsing For Each Loop");
		for (Set<String> statelist : india) {
			// System.out.println(statelist);
			for (String cities : statelist) {
				System.out.println(cities);
			}
		}
		System.out.println("\nUsing Iterator");
		Iterator<Set<String>> itr = india.iterator();
		while (itr.hasNext()) {
			Set<String> statelist = itr.next();
			// System.out.println(statelist);
			Iterator<String> itr2 = statelist.iterator();
			while (itr2.hasNext()) {
				String city = itr2.next();
				System.out.println(city);
			}
		}
//		System.out.println("\nUsing For Loop");
//		for (int i = 0; i < india.size(); i++) {
////			System.out.println(india.get(i));
//			Set<String> llist = india.get(i);
//			for (int j = 0; j < llist.size(); j++) {
//				System.out.println(llist.get(j));
//			}
	}
}
