package chapter_01;

import java.util.function.Supplier;

public class NestedClasses {
	int a = 30;
	/*
	 * ""Member inner class""
	 * 
	 * -public, final, protected, default olabilir
	 * -abstract veya final olabilir
	 * -bir sınıfı kalıtabilir veya interface'i implement edebilir.
	 * -static değişken ve metod tanımlayamaz.
	 * -dıştaki sınıfın tüm üyelerine erişebilir. private dahil.
	 */
	public class MemberInner {
		// static int a = 0; // Does not Compile
		int a = NestedClasses.this.a;
	}

	public void callInner() { // static metod olursa aşağıdaki kod çalışmaz
		MemberInner a = new MemberInner();
	}
	
	public static void main(String[] args) {
		// MemberInner a = new MemberInner(); // Does not Compile
		NestedClasses outer = new NestedClasses();

		MemberInner inner = outer.new MemberInner();
		NestedClasses.MemberInner inner2 = outer.new MemberInner();

		System.out.println(calculate());

		StaticInner staticInner = new StaticInner(); // direk nesne oluşturabiliriz
		int price = staticInner.price;
		
	}
	
	/*--------------------------------------------------------------------------------------------------
	 * ""Local Inner Class"
	 *
	 * 
	 * -Erişim belirleyicine sahip değiller.
	 * -Static değişken ve metod tanımlayamazlar.
	 * -Bulundukları metodun sadece final yani sabit değişkenlerine ulaşabilirler;
	 * -Dıştaki sınıfın tüm değişkenlerine erişebilir. 
	 * -Başka sınıfları kalıtabilir veya interfaceleri implement edebilir.
	 */
	 
	public static int calculate() {
		final int x = 3;
		int y = 2;

		class LocalInner {
			public int pow() {
				// return y*y; Does not compile - çünkü y final değil
				return x * x;
			}
		}
		LocalInner inner = new LocalInner();

		return inner.pow();
	}
	
	/*
	 * --------------------------------------------------------------------------------------------------
	 * ""Anonymous Inner Class"
	 * - var olan bir sınıfı veya interface'yi genişletebiliriz.
	 * 
	 */
	
	public void run() {
		Supplier<String> a = new Supplier<String>() {

			public String get() {
				return "Anonymous";
			}
		};

		a.get();
	}
	
	/* --------------------------------------------------------------------------------------------------
	 * ""Static Nested Class"
	 * - private veya başka türde olabilir.
	 * - Başka sınıfları kalıtabilir, interfaceleri implement edebilir. Member Inner sınıfları kalıtamaz.
	 * - Dış sınıfın içeriğine direk erişemez. O sınıfın objesini oluşturarak erişebilir.
	 * - static metod tanımlayabilir.
	 */
	
	private static class StaticInner {
		private int price = 6;
	}

}
