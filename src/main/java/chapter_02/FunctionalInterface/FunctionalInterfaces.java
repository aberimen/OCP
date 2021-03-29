package chapter_02.FunctionalInterface;

import java.util.function.Predicate;

@FunctionalInterface
interface Dance{
	void dance();
}

/*
 * - Tek bir gövdesiz metodu olmak zorunda.
 * - default ve static gövdeli metodları olabilir.
 */
public class FunctionalInterfaces {
	
	public static void main(String[] args) {
		Dance d = new Dance() {
			
			@Override
			public void dance() {
				System.out.println("Dancing");
				
			}
		};
		
		d.dance();
		
		//lambda ile
		
		Dance d1 = () -> System.out.println("Dancing");
		d1.dance();
		
		
	}
	
	/*
	 
	 -- Doğru Lambda Deyimleri
	  
  	1) () -> true 
 	2) (boolean a) -> {return a;}
	3) a -> return a;
 	4) (int x) -> {}
  
 	 -- Yanlış olanlar
 
  	1) a, b -> a.startsWith("test") // DOES NOT COMPILE -parametreler birden fazla olduğu için parentez içine alınmalı.
	2) c -> return 10; // DOES NOT COMPILE - return olduğu için gövde süslü parantez içine alınmalı 
	3) a -> { return a.startsWith("test") } // DOES NOT COMPILE - returndan sonra ; olmalı
	4) (int y, z) -> {int x=1; return y+10; } // DOES NOT COMPILE - y'nin tipi belirtildiği için z'ninkide belirtilmeli ya da ikisi belirtilmemeli
	5) a -> {int a = 5;} // DOES NOT COMPILE -çünkü a parametre
	
	 
 
 */

}


