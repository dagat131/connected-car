package exam08;


class Test {
//	String kind = "bird";
//	static String kind = "bird";
	
//	static void method1() { //static를 넣게 되면 객체생성 하지않고도 불러올수있다.
//		System.out.println("-- method1 --");
//	}
	
	String sum(int i, int j) {
		int a = i + j;
		int b = i - j;
		int c = i * j;
//		return a, b, c;    //리턴값은 2개가 최대
		String d = "" + a + "," + b +"," + c;
		return d;
	}
	
	public static void main(String[] args) {
//		Test test = new Test();   // 안에 위치하더라도 객체생성해서 불러와야함.
//		test.method1();
//		Test t = new Test();
//		t.method1();
//		method1();  //static를 넣게 되면 객체생성 하지않고도 불러올수있다.
		
//		Test t = new Test();
//		System.out.println((t.kind)); // 출력할려면 프린트. 객체생성 후 프린트 내에 넣어줘야함.
//		System.out.println(kind);  // 스태틱을 쓰면 객체생성하지않고도 바로 출력가능.   static -> 공유한다. 여러객체에서 공유가능.
		
		/* 접근제한자 : 
		 * public > (default)(아무것도 안붙이면 디폴트란 의미) > private
		 * public : 제한이 없다.   ->> 가장많이 사용
		 * default : 같은 패키지에서만 가능하다.
		 * private : 자기 클래스 내에서만 사용할 수 있다.
		 * 
		 *
		 * static : 객체생성없이 사용가능, 값을 공유할 때.
		 *          멤버변수든 멤버메소드든 안붙였을 때는 무조건 객체생성해서 사용..
		 * 
		 * 메소드 : 반복적인 것, 재사용 가능성이 있는 것을 등록해 놓고 필요 할 때 마다 불러내서 사용할 경우.
		 *        호출한다고 표현..
		 *        static 붙였을 때 안붙였을때 차이점. -> 붙이는 경우엔 객체생성하지 않고도 불러오기 가능
		 *                                     붙이지 않은 경우엔 객체생성 무조건 필요함.
		 * 
		 * 오버로딩(Overloading) : 매개변수가 중복되면 안된다., 생성자오버로딩, 메소드오버로딩 // 이름은 똑같고 매개변수 갯수나 배열이 다른 것을 오버로딩이라 한다.
		 * 오버라이딩(Overriding)
		 * 
		 * 캡슐화 : Getter & Setter   --> 멤버변수를 private 사용하는데 어떻게 활용하냐에서 캡슐화가 쓰임
		 *
		 * 2차원배열
		 * 
		 * 상속 : private, final
		 *  -> 재정의
		 *
		 */
		Test t = new Test();
		String result = t.sum(3, 5);   //넣는 값이 정수값이기 때문에 결과값도 정수로 맞춰주어야 한다.
		System.out.println(result);
		
		
		
		
		
	}

}
