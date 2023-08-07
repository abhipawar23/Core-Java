package com.collection;

import java.util.HashMap;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put(null, "five");
		map.put("111", "xxx");
		map.put("22", "seven");
		map.put("8", "eight");
		map.put("9", "nine");
		map.put("10", "ten");
		map.put("11", "eleven");
		map.put("12", "Twely");
		System.out.println(map);
	}
}
