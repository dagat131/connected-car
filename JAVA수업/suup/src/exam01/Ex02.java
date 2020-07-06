package exam01;

class Myclass {
	
	// Member Field : 멤버변수
	int x = 100;  //멤버필드, 멤버번수라고 함
	int y = 200;
	int z = 3000;
	
	// Constructor : 생성자  --> 클래스 이름과 같은건 생성자라 본다
//	public Myclass() {
		// TODO Auto-generated constructor stub
//	}
	
	// Method : 멤버 메소드
//	public void aaa {
		// public void aaa(){
//		}
		



	
	public static void main(String[] args) {
		int x = 30;
		Myclass my1 = new Myclass(); // 객체생성  my1 -> 참조형변수
		System.out.println(my1.x);
		System.out.println(my1.y);

		Myclass my2 = new Myclass(); // 객체생성  my2 -> 참조형변수 y
		System.out.println(my2.x);
		System.out.println(my2.y);
		
		Myclass my3 = new Myclass(); // 객체생성  my3 -> 참조형변수 z
		System.out.println(my3.y);
		System.out.println(my3.z);
	}
}

