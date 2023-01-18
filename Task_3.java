package ArrayDeque;

import java.util.ArrayDeque;

public class Task_3 {
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

		actor.addFirst("Vishnu");
		actor.addFirst("Ambreesh");
		actor.addFirst("Shivaji");

		System.out.println("final ArrayDeque :" + actor);
	}

}
