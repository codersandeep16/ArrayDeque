package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Task_2 {
	public static void main(String[] args) {
		ArrayDeque actor = new ArrayDeque();
		actor.add("Rajkumar");
		actor.add("Amitab");
		actor.add("Rajnikanth");
		actor.add("Sharukh");
		actor.add("Puneeth");
		actor.add("Vijay");
		actor.add("Surya");
		actor.add("Chiranjeevi");
		actor.add("Salman");

		System.out.println("ArrayDeque: " + actor);

		// Using iterator()
		Iterator<String> iterate = actor.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

}
