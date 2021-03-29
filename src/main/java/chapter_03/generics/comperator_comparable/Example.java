package chapter_03.generics.comperator_comparable;

import java.util.Set;
import java.util.TreeSet;

class Duck implements Comparable<Duck> {
	private int id;

	@Override
	public int compareTo(Duck o) {
		return o.id - id;
	}

}

class Rabbit {
	int id;
}

/*
 * TreeSet'e eklenen obje comparable olmalı.
 */

public class Example {

	public static void main(String[] args) {
		Set<Duck> set = new TreeSet<>();
		set.add(new Duck()); // OK

		Set<Rabbit> set1 = new TreeSet<>();
		set1.add(new Rabbit()); // Throws an exception
		
		Set<Rabbit> set2 = new TreeSet<>((o1 , o2) -> o1.id - o2.id); // with comparator
		set2.add(new Rabbit()); //OK

	}

}
