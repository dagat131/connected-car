package exam14;

public class Car extends vechile {
	/* ���
	 * �θ�� �����޾Ƽ� �ڽ��� ����Ѵ�. / �ڽ�Ŭ�������� �θ�Ŭ������ �����Ѵ�.
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
