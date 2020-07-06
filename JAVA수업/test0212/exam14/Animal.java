package exam14;

public class Animal {
	String name;
	int age;
	
	public Animal() {  //생성자
		
	}
	public Animal(String name, int age) {  //생성자
		this.name = name;
		this.age = age;
	}
	void sound() {  //메소드
		System.out.println("-- Animal sound() --");
	}
	
	void disp() {  //메소드
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}
