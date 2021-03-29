package chapter_01;

class Animal{	
}
class Dog extends Animal{ }
class Bird extends Animal{ }


public class InstanceOf {
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Bird bird = new Bird();
		
		System.out.println(dog instanceof Dog); // true
		System.out.println(dog instanceof Animal); // true
		System.out.println(dog instanceof Bird); // false
		
		//System.out.println(bird instanceof Dog); //compile error
		
		System.out.println(null instanceof Object); //false
		
		System.out.println(bird instanceof Object); //true
		
		StringBuilder a = new StringBuilder("ass");
		StringBuilder b = new StringBuilder("ab");
		
		
		
		
	}

}
