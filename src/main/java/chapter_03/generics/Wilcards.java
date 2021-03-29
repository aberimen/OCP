package chapter_03.generics;

import java.util.ArrayList;
import java.util.List;

public class Wilcards {
	
	/* 
	   Unbounded Wildcards <?> : -Herhangi bir tip olabilir
	   							 -Immutabledir
	  
	   Upper-Bounded Wildcards <? extends Class> : -O sınıfı kalıtan tipte olanlar için.
	                                               -Immutabledir
	  
	   Lower-Bounded Wildcards <? super String> : -String veya String'in superclass'ı olabilir.
	   											  -Mutabledir					
	*/
	
	public static void print(List<?> list) { 	
		//list.add("Deneme"); //Derlenmez çünkü wildcard ile artık immutabledir.
		
		for (Object x : list) {
			System.out.println(x);
		}
	}
	
	public static void addName(List<? super String> list) {
		list.add("aberimen"); //herhangi bir sorun yok çünkü değiştirilebilir.
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aberimen");
		
		print(list); // print(List<Object>) parametre alsaydı compile hatası alırdık.
		
		// List<Object> list1 = list; // DOES NOT COMPILE
		
		// List<Number> list2 = new ArrayList<Integer>(); // DOES NOT COMPILE
		// List<? extends Number> list3 = new ArrayList<Integer>();
		//list3.add(15); // DOES NOT COMPILE
		
		
	}
	
	

}
