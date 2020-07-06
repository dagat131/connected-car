package exam19;

public class DemoClass implements FirstInterface, SecondInterface{//인터페이스는 다중상속이 가능함

	@Override
	public void method2() {
		System.out.println("-- method2 --");
		
	}

	@Override
	public void method1() {
		System.out.println("-- method1 --");
		
	}
	
}
