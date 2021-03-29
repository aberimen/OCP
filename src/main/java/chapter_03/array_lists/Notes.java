package chapter_03.array_lists;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Notes{
	/*- Primitive tipleri içeremez.
	 * 
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");	
		//list.add("d"); // UnsupportedOperationException 
		
		String a = list.get(0); // "a"
		
		//list.toArray(); // listeyi diziye çevirir
		
		//list.get(0); // UnsupportedOperationException 
		
		List<String> sehirler = new ArrayList<>();
		sehirler.add("İstanbul");
		
		sehirler.add("Ankara");
		System.out.println(sehirler); // [İstanbul, Ankara]
		
		sehirler.remove(0); 
		System.out.println(sehirler); //[Ankara]
		
		sehirler.set(0, "İstanbul"); //[İstanbul]
		System.out.println(sehirler);
		
		sehirler.add(0, "Ankara");
		System.out.println(sehirler); //[Ankara, İstanbul]
		
		sehirler.clear();//[]
		System.out.println(sehirler);
		
		
		List<String> list2 = new ArrayList<>(10); // kapasitesi 10 ona göre önceden yer ayrılacak, 10dan sonra genişletilicek
	
		
		
	}
	
	/*
	 
	 add()-----------------------
	 boolean add(E element)
	 void add(int index, E element)
	 
	 remove()-----------------------
	 boolean remove(Object object)
	 E remove(int index)
	 
	 
	 set()-------------------------------
	 E set(int index, E newElement)
	 
	 ------------------------------------
	 boolean isEmpty()
	 int size()
	 
	 ------------------------------------
	 void clear()
	 boolean contains(Object object)
	 
	 
	 * 
	 */
}
