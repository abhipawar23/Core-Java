package failsafeandfailfast;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetExample {

	public static void main(String[] args) {

		System.out.println("-----HashSet-----");
		System.out.println("Fail Fast");
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(50);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			// set.add(1);
			Integer number = itr.next();
			System.out.println(number);
		}
		System.out.println("\nFail Safe");
		CopyOnWriteArraySet<Integer> itr1 = new CopyOnWriteArraySet<Integer>();
		itr1.add(100);
		itr1.add(200);
		itr1.add(100);
		itr1.add(212);
		Iterator<Integer> num = itr1.iterator();
		while (num.hasNext()) {
			itr1.remove(100);
			Integer i = num.next();
			System.out.println(itr1);
		}

	}
}
