package com.colectionsutilityclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassMethod {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		Collections.addAll(names, "Abhi", "SHiv", "Adi");
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Collections.shuffle(names);
		System.out.println(names);

		names = Collections.unmodifiableList(names);
		// names.add("Ad");
		// Collections.unmodifiableMap(null);
		// Collections.unmodifiableSet(null);

		// t1,t2
		Collections.synchronizedList(names);
		//Collections.synchronizedMap(null);
		//Collections.synchronizedSet(null);
	}

}
