package exam16;

public class Example {

	public static void main(String[] args) {
		
		
//		Dog dog = new Dog();
//		dog.animalSound();
//		Cat cat = new Cat();
//		cat.animalSound();
//		Pig pig = new Pig();
//		pig.animalSound();
		
				
		Animal animal = new Animal();
		animal.sound(new Dog());
		animal.sound(new Cat());
		
	}

}
