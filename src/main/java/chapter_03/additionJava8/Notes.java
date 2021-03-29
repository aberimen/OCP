package chapter_03.additionJava8;

interface Hesapla{
	int hesapla(int a, int b);
}

public class Notes {
	
	public static int topla(int a, int b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		Hesapla hesapla = (a,b) -> Notes.topla(a, b);
		
		Hesapla topla = Notes::topla;  // Method Reference ile
		
		int sonuc = topla.hesapla(15, 25);
		System.out.println(sonuc); //40
	}
	
	/*
	 * Method referans 4 şekilde olabilir
	 * Static metod
	 * Bir objeye ait Sınıf metodu
	 * Runtime'de saptanan objeye ait sınıf metodu
	 * Constructors
	 */

}
