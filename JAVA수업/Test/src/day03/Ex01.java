package day03;

public class Ex01 {

	public static void main(String[] args) {
		/* *형변환
		 * 자동형변환 : promotion, 묵시적형변환
		 * 강제형변환 : Casting, 명시적형변환
		 Promotion : 더 작은 타입을 더 큰 타입의 크기로 변환.
		 
		 */
		int myInt = 9;
		double myDouble = myInt;
		double myDouble1 = 9.78;
		int myInt1 = (int) myDouble; // (int) 강제 형변환
		
		
		int a = 130;
		byte b = (byte)a;
		
		long a1 = 123L;
		//long은 접미사로 L을 붙여줘야함. 그냥 123은 int타입으로 자동형변환이 이루어짐.
		float c = 123.3f;
		// float d = (float)123.3; 
		// 접미사가 붙지 않는 타입은 int, double이기 때문에 d값은 뒤에 f가 붙어줘야한다. 강제형변환이 필요
		
		System.out.println(b);
		System.out.println(a1);
		
		System.out.println();
		
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myDouble1);
		System.out.println(myInt1);
	
	}

}
