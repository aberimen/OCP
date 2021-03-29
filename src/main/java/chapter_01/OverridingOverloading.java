package chapter_01;

public class OverridingOverloading {

	/*
	 * Override : 
	 * -Method adı ve dönüş tipi aynı olmalı 
	 * -Erişim Belirleyici(Access Modifiers) genişletilebilir fakat daraltılamaz; public -> private olamaz.
	 * -Static, final, private metodlar override edilemez. 
	 * Overload: 
	 * -Method adı aynı parametre sayısı veya tipi farklı olmalı
	 * 
	 */

}

class Product {

	Product get() {
		return new Product();
	}

	protected void eat() {
	}
	
	public void eat(int count) {} // overload
}

class Food extends Product {

	// Covariant return type
	@Override
	Food get() { 
		return new Food(); 
	}

	@Override
	final public void eat() { //final olabilir
	}

	public void eat(String str) {
	} // override edilmez

	// public void eat() throws Exception{ } -olamaz
	
	
	// Object sınıfının metodlarını override etmek;
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}



