package exam02;
//��ü�� ����� ������? �ٸ� Ŭ������ �ҷ��鿩�ͼ� ��ü�� ���� �����ؾߵ�.
public class MyClassExample {

	
	public static void main(String[] args) {
		
		MyClass myclass1 = new MyClass();
		//��������
		//�ν��Ͻ�����
		//���۷�������
//		System.out.println(myclass1.x);
//		System.out.println(myclass1.y);
//		System.out.println(myclass1.z);
		myclass1.x = 100;
		myclass1.y = 200;
		myclass1.z = 300;
		System.out.println(myclass1.x);
		System.out.println(myclass1.y);
		System.out.println(myclass1.z);
		
		MyClass myclass2 = new MyClass();
//		System.out.println(myclass2.x);
//		System.out.println(myclass2.y);
//		System.out.println(myclass2.z);
		myclass2.x = 1000;
		myclass2.y = 2000;
		myclass2.z = 3000;
		System.out.println(myclass2.x);
		System.out.println(myclass2.y);
		System.out.println(myclass2.z);
		
		MyClass myclass3 = new MyClass();
		System.out.println(myclass3.x);
		System.out.println(myclass3.y);
		System.out.println(myclass3.z);
	}

}
