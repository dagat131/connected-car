package exam10;

class Ex03 {
//		private int a = 7; // error
	public int a = 7;
	
		void disp() {
		System.out.println("what?");
		}
}
	public class Test3{
		public static void main(String[] args) {
		Ex03 test3 = new Ex03();
		System.out.println(test3.a);
		test3.disp();

	}

}
