package exam14;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name,age); //super �� �θ𸦶���
	}
	void sound() {  //������
		super.sound();   //�θ��� ���� �ҷ���
		System.out.println("myam myam");
	}
}
