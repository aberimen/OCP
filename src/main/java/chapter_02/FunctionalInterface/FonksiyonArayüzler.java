package chapter_02.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class FonksiyonArayüzler {
	
	public static void main(String[] args) {
		
	//1. Consumer<T> : T türünde parametre alır ve işletir geriye değer döndürmez.
		
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Merhaba");
		
		//1.1 BiConsumer<T, U> : T ve U türünde iki parametre alır ve işler geriye değer döndürmez.
			BiConsumer<String, Integer> biConsumer = (s,i) -> System.out.println("Merhaba: "+s+"-Yaş: "+i); 
			biConsumer.accept("Abdurrahman", 23);
	
		
	//2. Function<T, R> : T türünde parametre alır R türünde parametre döner;
		Function<Integer,Double> function = (i) -> i*2.0;
		Double a = function.apply(5);
	
		System.out.println(a);
		
		//2.1 BiFunction<T, U, R>: T,U parametre alır R döner
		
		
	//3.UnaryOperator<T>: T türünde parametre alır ve T düründe değer döndürür. Yani girdi ve çıktımız aynı tipse bunu kullanırız.
		UnaryOperator<Integer> unaryOperator = (i) -> i*i;
		System.out.println(unaryOperator.apply(5));
		
		//3.1 BinaryOperator<T> : T şeklinde iki parametre alır ve T döndürür. BiFunction gibi ama tüm değerler aynı tipte.
		
		
		
	//4.Predicate<T>: T tipinde parametre alır ve boolean değer döner.
		Predicate<Integer> predicate = i -> i == 5;
		System.out.println(predicate.test(5));
		
		//4.1 BiPredicate<T, U> : T ve U şeklinde 2 değer alır boolean döner.
		
		
	//5. Supplier<T>: Hiç parametre almaz sadece T tipinde değer döndürür.
		Supplier<String> supplier = () -> "Merhaba";
		supplier.get();
		
	
		
	}
	

}