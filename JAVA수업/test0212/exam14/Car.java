package exam14;

public class Car extends vechile {
	/* 상속
	 * 부모걸 물려받아서 자식이 사용한다. / 자식클래스에서 부모클래스를 결정한다.
	 */
	
	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.modelName);
		car.honk();
		System.out.println(car.brand);
		System.out.println(car.modelName);
		

	}

}
