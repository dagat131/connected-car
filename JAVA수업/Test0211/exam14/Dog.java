package exam14;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age); //super �� �θ𸦶���
	}
	void sound() {  //������
		super.sound();    //�θ��� ���� �ҷ���
		System.out.println("bark bark");
	}
	
}
