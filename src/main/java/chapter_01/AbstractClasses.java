package chapter_01;

abstract class Cat{
	/*
	 * - Abstract class boş olabilir.
	 * - Normal metod barındırabilir.
	 * - Bu sınıftan nesne oluşturulamaz.
	 * - Bu sınıfın gövdesiz metodları override edilmek zorunda.
	 */
	
	abstract void clean();
}


public class AbstractClasses extends Cat{

	@Override
	void clean() {
		
	}
	
}
