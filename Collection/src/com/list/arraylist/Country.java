package com.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {

	public List<List<String>> addCountry() {
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

		return india;
	}

	public static void main(String[] args) {
		Country country = new Country();
		List<List<String>> india = country.addCountry();
		System.out.println(india);
		System.out.println("\nUsing For Each Loop");
		for (List<String> statelist : india) {
			// System.out.println(statelist);
			for (String cities : statelist) {
				System.out.println(cities);
			}
		}
		System.out.println("\nUsing Iterator");
		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {
			List<String> statelist = itr.next();
			// System.out.println(statelist);
			Iterator<String> itr2 = statelist.iterator();
			while (itr2.hasNext()) {
				String city = itr2.next();
				System.out.println(city);
			}
		}
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < india.size(); i++) {
//			System.out.println(india.get(i));
			List<String> llist = india.get(i);
			for (int j = 0; j < llist.size(); j++) {
				System.out.println(llist.get(j));
			}
		}
	}
}
