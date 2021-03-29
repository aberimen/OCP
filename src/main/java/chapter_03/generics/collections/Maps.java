package chapter_03.generics.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	
	/*
	 * Map: K,V ikilisini içerir.
	 * Keyler benzersizdir. 
	 * indexlenmezler.
	 * Metodları: 
	 * 
	 *  V get(Object key): Girilen Key'e denk gelen değeri döner.
	 *  V put(K key, V value): Key ve Değer eklemek veya değiştirmek için kullanılır, önceki değeri döner yoksa null döner.
	 *  V remove(Object key): Silinen keyin değerini dönderir.
	 *  boolean containsKey(Object key): Key var mı
	 *  boolean containsValue(Object): Değer var mı
	 *  Set<K> keySet() : Tüm keyleri set olarak döner.
	 *  Collection<V> values(): Tüm değerleri collection olarak döner.
	 *  void clear() 
	 *  boolean isEmpty() 
	 *  int size()
	 */
	
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		map.get("lion"); //meat
		
		for (String s : map.keySet()) {
			System.out.print(s + ","); //koala,giraffe,lion,
		}
		
		map.put(null, null);
		
		Map<String, String> mapTree = new TreeMap<>(); // Keyleri sıralar
		// mapTree.put(null, null); NullPointerException
		
	}

}
