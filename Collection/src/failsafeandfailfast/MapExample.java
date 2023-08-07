package failsafeandfailfast;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
	public static void main(String[] args) {
		System.out.println("Fail Fast");
		Map<Integer, String> student = new LinkedHashMap<>();
		student.put(10, "ABhi");
		student.put(20, "Shiv");
		student.put(15, "Avesh");

		Set<Entry<Integer, String>> entries = student.entrySet();
		Iterator<Entry<Integer, String>> itr = entries.iterator();
		while (itr.hasNext()) {
			// student.put(11, "ABC"); //ConcurrentModificationException
			Entry<Integer, String> i = itr.next();
			System.out.println(i);
		}

		System.out.println("\nFail Safe");
		ConcurrentHashMap<Integer, String> emp = new ConcurrentHashMap<>();
		emp.put(1, "ABC");
		emp.put(5, "XYZ");
		emp.put(3, "PQR");

		Set<Integer> key = emp.keySet();
		Iterator<Integer> itr1 = key.iterator();
		while (itr1.hasNext()) {
			emp.put(4, "ABHI");
			Integer i = itr1.next();
			System.out.println(i + " " + emp.get(i));
		}
	}
}