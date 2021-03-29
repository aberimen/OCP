package chapter_03.additionJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceExample {
	
	public static void main(String[] args) {
		
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		Consumer<List<Integer>> lamda1 = l -> Collections.sort(l);
		
		List<Integer> list = Arrays.asList(1,8,2,4,9,12,3);
		
		methodRef1.accept(list);
		lamda1.accept(list);
		
		String str = "aberimen";
		Predicate<String> methodRef2 = str::startsWith; //Method Reference with instance
		Predicate<String> lamda2 = s -> str.startsWith(s);
		
		methodRef2.test("ab");
		lamda2.test("ab");
		
		Predicate<String> methodRef3 = String::isEmpty; // Not static
		Predicate<String> lamda3 = s -> s.isEmpty();
		
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lamda4 = () -> new ArrayList();
	
	}

}
