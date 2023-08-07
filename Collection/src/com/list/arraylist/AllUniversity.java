package com.list.arraylist;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.studentmgtsystem.University;

public class AllUniversity {

	public List<List<String>> addAllUniversity() {
		List<String> mumbaiUniversity = new ArrayList<>();
		mumbaiUniversity.add("BAC");
		mumbaiUniversity.add("BCS");
		mumbaiUniversity.add("BSC");

		List<String> puneUniversity = new ArrayList<>();
		puneUniversity.add("Eng In IT");
		puneUniversity.add("Eng In ENTC");
		puneUniversity.add("Eng In Arctech");

		List<String> shivajiUniversity = new ArrayList<>();
		shivajiUniversity.add("Diploma In IT");
		shivajiUniversity.add("Diploma In Mechnical");
		shivajiUniversity.add("Diploma In ENTC");

		List<List<String>> maharashtraUniversity = new ArrayList<>();
		maharashtraUniversity.add(mumbaiUniversity);
		maharashtraUniversity.add(puneUniversity);
		maharashtraUniversity.add(shivajiUniversity);
		return maharashtraUniversity;

	}

	public static void main(String[] args) {
		AllUniversity alluniversitylist = new AllUniversity();
		List<List<String>> maharashtraUniversity = alluniversitylist.addAllUniversity();
		System.out.println(maharashtraUniversity);
		System.out.println("\nUsnig For Each Loop");
		for (List<String> universities : maharashtraUniversity) {
			for (String cources : universities) {
				System.out.println(cources);
			}
		}
		System.out.println("\nUsing Iterator");
		Iterator<List<String>> allUniversities = maharashtraUniversity.iterator();
		while (allUniversities.hasNext()) {
			List<String> universities = allUniversities.next();
			// System.out.println(universities);
			Iterator<String> allCources = universities.iterator();
			while (allCources.hasNext()) {
				String cources = allCources.next();
				System.out.println(cources);
			}
		}
		System.out.println("\nUsing For Loop");
		for (int i = 0; i < maharashtraUniversity.size(); i++) {
			List<String> cources = maharashtraUniversity.get(i);
			for (int j = 0; j < cources.size(); j++) {
				System.out.println(cources.get(j));
			}
		}

	}

}
