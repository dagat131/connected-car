package exam09;

public class Ex09 {
	
	//OverLoading(오버로딩) 메소드의 값이 같아도 실행이 된다. 똑같은게 여러개 있는데 실행을 시키는것. 인트, 더블(자료형)을  다르게 줘야함.
//	                    메소드 오버로딩  , 생성자 오버로딩 가능
	// 함수이름 같아도 자료형이 다르면 실행이 가능함.
	// 매개변수가 중복되면 안된다., 생성자오버로딩, 메소드오버로딩 
	
	static int method(int x, int y) {
		return x + y;
	}
	static double method(double x, double y) {
		return x + y;
	}
	static double method(int x, double y) {
		return x + y;
	}
	static double method(double y, int x) {
		return x + y;
	}
	static double method(int x, int y, int z) {
		return x + y;
	}
	
	
	public static void main(String[] args) {
		int result1 = method(3,5);
		double result2 = method(3.0, 5.0);
		System.out.println(result1);
		System.out.println(result2);
	}

}
