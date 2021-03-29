package chapter_03.generics.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class Sets {
	
	/* Set Interface: Tekrara izin vermezler.
	 * 
	 * HashSet : Sırasızdır.
	 * TreeSet: Ağaç yapısında küçükten büyüğe doğru sıralar. Null değerlere izin vermez.
	 */
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("aberimen");
		set.add("aberimen"); //false
		
		System.out.println(set); //[aberimen]
		set.add(null);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("C"); //false
		treeSet.add("A");
		//treeSet.add(null); //java.lang.NullPointerException
		
		System.out.println(treeSet); // [A, B, C]
	}

}
