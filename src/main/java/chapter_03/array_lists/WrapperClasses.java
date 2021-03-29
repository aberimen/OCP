package chapter_03.array_lists;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1); // autoboxing
		list.add(Integer.valueOf(2));
		
		list.add(Integer.valueOf(3));
		
		list.remove(1); // index'i 1 olan elemanı siler.
		list.remove(Integer.valueOf(3));
		
		System.out.println(list); // [1]
		
		System.out.println(list instanceof ArrayList);
	}

}
