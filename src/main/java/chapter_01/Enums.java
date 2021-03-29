package chapter_01;

public class Enums {

	public static void main(String[] args) {
		// enum metodları aşağıda kullanılmıştır
		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}

		System.out.println(("WINTER".equals(Season.WINTER))); // false

		Season season = Season.SUMMER;
		switch (season) {
		case WINTER:
			System.out.println("Cold");
			break;
		case SUMMER:
			System.out.println("Hot");
			break;
		// case Season.FALL: break; //DOES NOT COMPILE
		// case "SPRING": System.out.println(); //DOES NOT COMPILE
		}
		
	}

}


enum Season{
	/*
	 * enumlar sabitleri içerir, 
	 * enum değerleri public, final ve static'tir.
	 * Tip güvenliğini sağlarlar. 
	 * 
	 */
	
	WINTER,SPRING,SUMMER,FALL //sadece değerler tanımlandığında ; noktalı virgüle gerek yok.
	
}

enum Status {
	/*
	 * Enumlar içine değişken, metod ve yapılandırıcı(constructor) tanımlanabilir.
	 * Constructor sadece private ve default olabilir.
	 * 
	 */
	NOT_FOUND(404), FORBIDDEN(403);

	private int httpCode;

	 Status(int httpCode) { // Constructor enum çağırıldığında sadece bir kez çalışır. 
		this.httpCode = httpCode;
	}

	public int getHttpCode() {
		return this.httpCode;
	}
}

enum Status2{
	NOT_FOUND {
		@Override
		public int getHttpCode() {
			return 404;
		}
	}, FORBIDDEN {
		@Override
		public int getHttpCode() {
			return 403;
		}
	};
	
	public abstract int getHttpCode(); // her enum değeri bu metodu override etmek zorunda;
}

// enum ExtendedSeason extends Season { } // DOES NOT COMPILE - Enumlar kalıtılamaz
