package chapter_03.generics;


public class GenericMethods {
	/*
	 * - Static metodlarda daha kullanışlı olmasına rağmen static olmayan metodlarda da kullanılabilir.
	 */
	
	
	public static <T> T get(T t){ //<T> olmak zorunda , dönüş tipini değil generic olduğunu belirtir
		return t;
	}
	
	public <T> void go(T t) {} // <T>  olmak zorunda
	
	// public static T noGood(T t) { return t; } // DOES NOT COMPILE
	
	public static void main(String[] args) {
		
		int deger = get(Integer.valueOf(25)); //25
		
		String a = GenericMethods.<String>get("aberimen");// "aberimen"
	}
}
