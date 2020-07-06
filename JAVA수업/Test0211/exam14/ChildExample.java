package exam14;

public class ChildExample {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		System.out.println(p.a);
//		System.out.println(p.name);
		
		Child c = new Child();
		System.out.println(c.b);
		
		System.out.println(c.a);    // 재정의. 자식값에서 같은변수로 값을 가지고 있을때 값이 재정의됨.
		System.out.println(c.name);   //상속받았기 때문에 사용가능.
		
		c.method1();  //메소드 재정의  / 부모, 변수이름이 같은 것을 바꾸는 것이 재정의
		
	}

}
