package exam15;

public class Example {
	
	public static void main(String[] args) {
//		Animal ani = new Animal();
//		ani.animalSound();
//		
//		Dog dog = new Dog();
//		dog.animalSound();
		
//		Animal dog = new Dog();
//		dog.animalSound();
//		Animal cat = new Cat();
//		cat.animalSound();
//		Animal pig = new Pig(); // ��ӹ��� �ʾƼ� ������ �ȵ�.
		
		//����� ���ؼ� �ٸ� Ŭ������ �Ӽ��� �޼ҵ带 ����� �� �ִ�.
		//������ : �θ��� �ڷ����� ����� ���� �ڽ��� ��ü�� ��� ���� �������̶�� �Ѵ�

		
		Animal dog = new Dog();  //�ڵ�����ȯ    �θ�Ÿ�� > �ڽ�Ÿ�� �̱⶧��
		dog.sound(dog);
		Animal cat = new Cat();
		cat.sound(cat);
		Animal pig = new Pig();
		pig.sound(pig);
		Animal chicken = new Chicken();
		chicken.sound(chicken);
		
		
		
		Dog d1 = (Dog) dog; //��������ȯ  �θ�Ÿ�Կ� �� �ִ� �� ����Ÿ������ �������°�
		//������(Polymorphism) : 
//		������  + ����ȯ
//		Animal animal = new Dog(); //�ڵ�����ȯ
//		Dog dog = (Dog)animal; // ��������ȯ
//		Cat ca = (Cat) d1; //���� �ٸ� Ŭ������ ������ ��������ȯ�� �Ұ���.
		
	}

}
