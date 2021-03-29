package chapter_02.FunctionalInterface;

class Animal {
	private String name;
	private boolean canHop;
	private boolean canSwim;


	public Animal(String name, boolean canHop, boolean canSwim) {
		this.name = name;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

interface CheckTrait {
	boolean test(Animal animal);
}

public class AnimalApp {
	
	public static void print(Animal animal, CheckTrait checkTrait) {
		if(checkTrait.test(animal)) {
			System.out.println(animal);
		}
	}
	public static void main(String[] args) {
		Animal fish = new Animal("Fish", false, true);
		Animal rabbit = new Animal("Rabbit", true, false);
		
		print(fish, (a)-> { return a.isCanHop();}); //gövdesi tek satır olduğu için return yazmasak da olur
		print(rabbit, b -> b.isCanHop());
		print(fish, (Animal a)-> { return a.isCanSwim();});// süslü parantez içindeyken ; kullanmalı ve return yazılmalı
	}
	
	
}
