package exam14;

public class Animal {
	String name;
	int age;
	
	public Animal() {  //������
		
	}
	public Animal(String name, int age) {  //������
		this.name = name;
		this.age = age;
	}
	void sound() {  //�޼ҵ�
		System.out.println("-- Animal sound() --");
	}
	
	void disp() {  //�޼ҵ�
		System.out.println("�̸� : " + name + ", ���� : " + age);
	}
}
