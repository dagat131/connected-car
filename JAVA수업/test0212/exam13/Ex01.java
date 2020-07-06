package exam13;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void disp() {
		System.out.println(name + " : " + age);
	}

}


public class Ex01 {

	public static void main(String[] args) {
		Person[] pa = new Person[5];  // °´Ã¼¹è¿­
		pa[0] = new Person("È«±æµ¿", 22);
		pa[1] = new Person("±èÃ¶¼ö", 32);
		pa[2] = new Person("ÀÌ¿µÈñ", 27);
		pa[3] = new Person("À±¼öÁø", 44);
		pa[4] = new Person("±èÁ¤±æ", 29);

		for(int i = 0; i < pa.length; i++) {
			pa[i].disp();
		}
		
	}

}
