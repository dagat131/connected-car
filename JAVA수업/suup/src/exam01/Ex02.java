package exam01;

class Myclass {
	
	// Member Field : �������
	int x = 100;  //����ʵ�, ���������� ��
	int y = 200;
	int z = 3000;
	
	// Constructor : ������  --> Ŭ���� �̸��� ������ �����ڶ� ����
//	public Myclass() {
		// TODO Auto-generated constructor stub
//	}
	
	// Method : ��� �޼ҵ�
//	public void aaa {
		// public void aaa(){
//		}
		



	
	public static void main(String[] args) {
		int x = 30;
		Myclass my1 = new Myclass(); // ��ü����  my1 -> ����������
		System.out.println(my1.x);
		System.out.println(my1.y);

		Myclass my2 = new Myclass(); // ��ü����  my2 -> ���������� y
		System.out.println(my2.x);
		System.out.println(my2.y);
		
		Myclass my3 = new Myclass(); // ��ü����  my3 -> ���������� z
		System.out.println(my3.y);
		System.out.println(my3.z);
	}
}

