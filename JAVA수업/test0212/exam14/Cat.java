package exam14;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name,age); //super 는 부모를뜻함
	}
	void sound() {  //재정의
		super.sound();   //부모의 것을 불러옴
		System.out.println("myam myam");
	}
}
