package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllUniversity {

	public Set<Set<String>> addAllUniversity() {
		Set<String> mumbaiUniversity = new HashSet<>();
		mumbaiUniversity.add("BAC");
		mumbaiUniversity.add("BCS");
		mumbaiUniversity.add("BSC");
		mumbaiUniversity.add("BCS");
		mumbaiUniversity.add(null);
		mumbaiUniversity.add(null);

		Set<String> puneUniversity = new HashSet<>();
		puneUniversity.add("Eng In IT");
		puneUniversity.add("Eng In ENTC");
		puneUniversity.add("Eng In Arctech");
		puneUniversity.add(null);
		puneUniversity.add("Eng In IT");

		Set<String> shivajiUniversity = new HashSet<>();
		shivajiUniversity.add("Diploma In IT");
		shivajiUniversity.add("Diploma In Mechnical");
		shivajiUniversity.add("Diploma In ENTC");

		Set<Set<String>> maharashtraUniversity = new HashSet<>();
		maharashtraUniversity.add(mumbaiUniversity);
		maharashtraUniversity.add(puneUniversity);
		maharashtraUniversity.add(shivajiUniversity);
		return maharashtraUniversity;

	}

	public static void main(String[] args) {
		AllUniversity alluniversitylist = new AllUniversity();
		Set<Set<String>> maharashtraUniversity = alluniversitylist.addAllUniversity();
		System.out.println(maharashtraUniversity);
		System.out.println("\nUsnig For Each Loop");
		for (Set<String> universities : maharashtraUniversity) {
			for (String cources : universities) {
				System.out.println(cources);
			}
		}
		System.out.println("\nUsing Iterator");
		Iterator<Set<String>> allUniversities = maharashtraUniversity.iterator();
		while (allUniversities.hasNext()) {
			Set<String> universities = allUniversities.next();
			// System.out.println(universities);
			Iterator<String> allCources = universities.iterator();
			while (allCources.hasNext()) {
				String cources = allCources.next();
				System.out.println(cources);
			}
		}
//		System.out.println("\nUsing For Loop");
//		for (int i = 0; i < maharashtraUniversity.size(); i++) {
//			Set<String> cources = maharashtraUniversity.get(i);
//			for (int j = 0; j < cources.size(); j++) {
//				System.out.println(cources.get(j));
//			}
//		}

	}

}
