package exam17;

public class Dog implements Animal {//구현클래스

	@Override
	public void animalSound() {
		System.out.println("-- bark --");
		
	}

	@Override
	public void sleep() {
		System.out.println("-- dog Zzz --");
		
	}  
	

}
