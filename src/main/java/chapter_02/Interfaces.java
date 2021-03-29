package chapter_02;

public class Interfaces {
	
	/* - metodları public ve abstract'ır. Implement eden class erişim belirleyicini daraltamaz.
	 * - sadece default, static ve private gövdeli metod tanımlanabilir.
	 * - Iki farklı interface'de aynı default metod varsa, interfaceleri implement eden class birini override etmek zorunda.
	 * onun dışında default metodları override etme zorunluluğu yoktur.
	 * - Sadece public static final değişkenler tanımlanabilir. Bunlar belirtilmese bile otomatik olarak değişkene atanıyor.
	 * -Tüm üyeleri publictir.
	 * - Bir interface final olamaz.
	 * - Public ve default olabilir.
	 */
	
	public static void main(String[] args) {
		
	}

}

  interface Hayvan {
	int MAX_SPEED = 150; // public static ve finaldir
	
	void avlan(); // public ve abstract
	
	public default void gez() {
		System.out.println("Hayvan Geziyor");
		
	}
	
	

}
