package chapter_02.DesignPatterns;

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		a.addCount();
		
		Singleton b = Singleton.getInstance();
		b.addCount();
		System.out.println(a.getCount()); // 2
	}
}

/*
 * Creational Design Pattern (Yaratımsal Desenler) grubunda yer alır.
 * 
 * - Bu desen çalışma zamanında sadece bir nesne oluşturulmasını garanti eder.
 * - Birden çok sınıfın bu tek benzersiz nesneyi kullanabilmesi gerek.
 */

class Singleton {
	
	private int count = 0;
	
	private static final Singleton instance = new Singleton();

	private Singleton() { //Dışardan nesne oluşturmamak için yapılandırıcımız private.
		System.out.println("Singleton obje oluştu..."); // bir kez çalışmasını bekliyoruz, aksi halde singleton yapısına uymaz.
	}

	public static Singleton getInstance() {
		return instance;
	}
	
	public synchronized void addCount() { // synchronized : bir threadin diğerini beklemesi için. aynı anda işlem yapılmaması için.
		this.count++;
	}
	
	public synchronized int getCount() {
		return this.count;
	}
}

// class ExtendSingleton extends Singleton{ } // sınıf kalıtılamaz çünkü yapılandırıcısı private.



/*------ Static block initialization
 
   static{
    try{
        instance = new Singleton();
    }catch(Exception e){
        throw new RuntimeException("Nesne oluşturulamadı.");
    }
}
 * 
 * 
 * 
 --------- Lazy Initialization
 - Yukarıdaki sınıflar çalıştığı gibi nesne üretecektir. Belki de hiç kullanmayacağız, boşuna yer işgal edecek. 
   Fakat biz sonradan nesnenin ilk oluşturulmasını isteyebiliriz.
 	
 	private static Singleton instance;
 	
	public static Singleton getInstance(){
    if(instance == null){
        instance = new Singleton(); // NOT THREAD-SAFE!
    }
    return instance;
}
 
 --------- Thread Safe Singleton
 - Bu metodun sürekli çağırılması performansı yoracaktır. Threadler birbirini bekleyecek.
 	public static synchronized Singleton getInstance(){
    if(instance == null){
        instance = new Singleton(); 
    }
    return instance;
}

 --- Singletons with Double‐Checked Locking
 
	public static  Singleton getInstance(){ 
        if(instance == null){
        	synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton(); 
				}
			} 
        }
        return instance;
    }
 
 */ 


