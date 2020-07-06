package exam14;

public class AnimalExample {

	public static void main(String[] args) {
		Dog d = new Dog("john", 5);
		d.disp();
		d.sound();    //메소드재정의
		
		Cat c = new Cat("Tom", 8);
		c.disp();
		c.sound();    //메소드재정의
		
	}

}
