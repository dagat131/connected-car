package exam17;

public class Dog implements Animal {//����Ŭ����

	@Override
	public void animalSound() {
		System.out.println("-- bark --");
		
	}

	@Override
	public void sleep() {
		System.out.println("-- dog Zzz --");
		
	}  
	

}
