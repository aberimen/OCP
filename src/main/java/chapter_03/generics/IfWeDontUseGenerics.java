package chapter_03.generics;

import java.util.*;

public class IfWeDontUseGenerics {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(5); // autoboxing Integer
		
		System.out.println(list); //[5]
		
		//int a =  list.get(0); //DOES NOT COMPILE - unboxing başarısız, çünkü türü belli değil, derleyici neye unbox yapacağını bilmiyor 
		
	}

}
