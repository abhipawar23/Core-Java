package array;

import java.util.HashSet;

public class DuplicateUSingHashSet {

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 7, 9};

		HashSet<Integer> set = new HashSet<>();

//		System.out.println(set.add(12)); // true
//		System.out.println(set.add(12)); // false
		int count = 0;

		for (int vlaue : a) {
			if (!set.add(vlaue)) {
				count++;
			}
		}

		if (count != 0)
			System.out.println("It contains duplicate");
		else
			System.out.println("It doesn't contains duplicate");

	}

}
