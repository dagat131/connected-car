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
//		Animal pig = new Pig(); // 상속받지 않아서 실행이 안됨.
		
		//상속을 통해서 다른 클래스의 속성과 메소드를 사용할 수 있다.
		//다형성 : 부모의 자료형에 상속을 받은 자식의 객체를 담는 것을 다형성이라고 한다

		
		Animal dog = new Dog();  //자동형변환    부모타입 > 자식타입 이기때문
		dog.sound(dog);
		Animal cat = new Cat();
		cat.sound(cat);
		Animal pig = new Pig();
		pig.sound(pig);
		Animal chicken = new Chicken();
		chicken.sound(chicken);
		
		
		
		Dog d1 = (Dog) dog; //강제형변환  부모타입에 들어가 있는 걸 원래타입으로 돌리려는것
		//다형성(Polymorphism) : 
//		재정의  + 형변환
//		Animal animal = new Dog(); //자동형변환
//		Dog dog = (Dog)animal; // 강제형변환
//		Cat ca = (Cat) d1; //완전 다른 클래스기 때문에 강제형변환이 불가함.
		
	}

}
