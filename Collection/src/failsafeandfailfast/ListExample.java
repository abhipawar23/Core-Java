package failsafeandfailfast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExample {

	public static void main(String[] args) {
		System.out.println("-----ArrayList-----");
		System.out.println("Fail Fast");
		List<String> name = new ArrayList<>();
		Collections.addAll(name, "Abhishek", "Shiv", "Avesh");
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) { // fail fast
			// name.add("Sushant"); // ConcurrentModificationException
			String names = itr.next();
			System.out.println(names);
		}
		System.out.println("\nFail Safe");
		CopyOnWriteArrayList<String> name1 = new CopyOnWriteArrayList<>();
		Collections.addAll(name1, "Abhishek", "Shiv", "Avesh");
		Iterator<String> itr2 = name1.iterator();
		while (itr2.hasNext()) {
			name1.add("ABHI"); // Fail safe
			String i = itr2.next();
			System.out.println(i);
			System.out.println(name1);
		}
		System.out.println("\n-----LinkList-----");
		System.out.println("Fail Fast");
		List<Integer> id = new LinkedList<>();
		Collections.addAll(id, 10, 20, 40, 60);
		Iterator<Integer> itr1 = id.iterator();
		while (itr1.hasNext()) {
			// id.add(100); //fail fast
			Integer ids = itr1.next();
			System.out.println(ids);
		}
		System.out.println("\nFail Safe");
		CopyOnWriteArrayList<Integer> id1 = new CopyOnWriteArrayList<>();
		Collections.addAll(id1, 10, 20, 30, 40, 60);
		Iterator<Integer> itr3 = id1.iterator();
		while (itr3.hasNext()) {
			id1.remove(1);
			System.out.println(itr3.next());
			System.out.println(id1);

		}

	}
}