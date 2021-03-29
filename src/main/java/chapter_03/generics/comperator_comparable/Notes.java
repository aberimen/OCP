package chapter_03.generics.comperator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Comparable direk sınıfa uygulanır ve tek bir özellik baz alınarak karşılaştırma yapılır ona göre sıralanır,
 *comparator ise ayrı bir sınıf olarak uygulanıp, istedeğimiz sınıfın istediğimiz özelliklerine göre sıralamayı yapabiliriz,
 *bunun için farklı sıralama yapan sınıflar oluşturup Comparator interface'i implement etmememiz gerekiyor.
 * 
 */
class Animal implements Comparable<Animal> { //Comparable
	public int id;
	public String name;

	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Animal o) {
		
		return o.id - id;// descending order. 
		// return id - o.id; //ascending order.
	}

}

class SortByName implements Comparator<Animal>{ //Comparator

	@Override
	public int compare(Animal o1, Animal o2) {
		
		return o1.name.compareTo(o2.name); // isme göre sıralama
	}
	
}
public class Notes {

	public static void main(String[] args) {
		Animal a1 = new Animal(5, "Duck");
		Animal a2 = new Animal(8, "Rabbit");
		
		System.out.println(a1.compareTo(a2)); //3
		
		List<Animal> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		
		Collections.sort(list);
		
		System.out.println(list); //[Rabbit, Duck]
		
		Collections.sort(list, new SortByName()); 

		System.out.println(list); //[Duck, Rabbit]
		
		
		
	}

}
